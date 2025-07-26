package learnProject.ui;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"org.example"},
        features = {"src/test/resources/ui/feature"}
)
public class CucumberRunnerTest {
}