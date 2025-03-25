package cicd.pipline

pipeline {
    agent any

    parameters {
        string(name: 'TEST_BRANCH_NAME', defaultValue: 'master', description: 'Ветка для сборки')
        choice(name: 'TEST_SUITE', choices: ['api'], description: 'Выбор тестов')
    }

    environment {
        GRADLE_HOME = tool 'gradle_java'
        ALLURE_HOME = tool 'allure_jenkins'
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    checkout([
                            $class: 'GitSCM',
                            branches: [[name: "${params.TEST_BRANCH_NAME}"]],  // Исправлено: BRANCH → TEST_BRANCH_NAME
                            extensions: [],
                            userRemoteConfigs: [[
                                                        url: 'https://github.com/SmirnovBogdan8/AutoTestProject.git',
                                                        credentialsId: 'your-credentials-id'  // Рекомендуется добавить (создайте в Jenkins)
                                                ]]
                    ])
                }
            }
        }

        stage('Build & Test') {
            steps {
                script {
                    def testCommand = "test"
                    if (params.TEST_SUITE == 'api') {
                        testCommand += " --tests api.restAssuredTest.*"
                    }

                    sh "./gradlew clean ${testCommand} --stacktrace"
                }
            }
            post {
                always {
                    allure([
                            includeProperties: false,
                            jdk: '',
                            properties: [],
                            reportBuildPolicy: 'ALWAYS',
                            results: [[path: 'build/allure-results']],
                            commandline: "${env.ALLURE_HOME}/bin/allure"  // Явное указание пути к Allure
                    ])
                }
            }
        }
    }

    post {
        always {
            cleanWs()
        }
        success {
            slackSend(
                    channel: '#your-channel',  // Укажите канал
                    color: 'good',
                    message: "Сборка успешна: ${env.JOB_NAME} #${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
            )
        }
        failure {
            slackSend(
                    channel: '#your-channel',
                    color: 'danger',
                    message: "Сборка упала: ${env.JOB_NAME} #${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
            )
        }
    }
}