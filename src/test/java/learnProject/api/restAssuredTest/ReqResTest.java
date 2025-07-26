package learnProject.api.restAssuredTest;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Feature("API тестирование")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ReqResTest {
    private static String URL;

    @BeforeAll
    public static void setup() {
        RestAssured.filters(new AllureRestAssured());
        URL = "https://reqres.in/";
    }

    @Test
    @Description("LIST USERS")
    @Order(1)
    public void getListUsersTest() {
        String endPoint = "learnProject/api/users?page=2";
        Response response =  given()
                .when()
                .get(URL + endPoint);
        assertEquals(200, response.getStatusCode());
    }

    @Test
    @Description("SINGLE USER")
    @Order(2)
    public void getSingleUserTest() {
        String endPoint = "learnProject/api/users/2";
        Response response =  given()
                .when()
                .get(URL + endPoint);
        assertEquals(200, response.getStatusCode());
    }

    @Test
    @Description("SINGLE USER NOT FOUND")
    @Order(3)
    public void getSUNotFoundTest() {
        String endPoint = "learnProject/api/users/23";
        Response response =  given()
                .when()
                .get(URL + endPoint);
        assertEquals(404, response.getStatusCode());
    }

    @Test
    @Description("LIST <RESOURCE>")
    @Order(4)
    public void getListResourceTest() {
        String endPoint = "learnProject/api/unknown";
        Response response =  given()
                .when()
                .get(URL + endPoint);
        assertEquals(200, response.getStatusCode());
    }

    @Test
    @Description("SINGLE <RESOURCE>")
    @Order(5)
    public void getSingleResourceTest() {
        String endPoint = "learnProject/api/unknown/2";
        Response response =  given()
                .when()
                .get(URL + endPoint);
        assertEquals(200, response.getStatusCode());
    }

    @Test
    @Description("SINGLE <RESOURCE> NOT FOUND")
    @Order(6)
    public void getSRNotfound() {
        String endPoint = "learnProject/api/unknown/23";
        Response response =  given()
                .when()
                .get(URL + endPoint);
        assertEquals(404, response.getStatusCode());
    }

    @Test
    @Description("CREATE")
    @Order(7)
    public void postCreateTest() {
        String requestBody = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        String endPoint = "learnProject/api/users";
        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(URL + endPoint)
                .then()
                .statusCode(201);
    }

    @Test
    @Description("PUT UPDATE")
    @Order(8)
    public void putUpdateTest() {
        String requestBody = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        String endPoint = "learnProject/api/users/2";
        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .put(URL + endPoint)
                .then()
                .statusCode(200);
    }

    @Test
    @Description("PATCH UPDATE")
    @Order(9)
    public void patchUpdateTest() {
        String requestBody = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        String endPoint = "learnProject/api/users/2";
        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .patch(URL + endPoint)
                .then()
                .statusCode(200);
    }

    @Test
    @Description("DELETE")
    @Order(10)
    public void deleteTest() {
        String endPoint = "learnProject/api/users/2";
        given()
                .when()
                .delete(URL + endPoint)
                .then()
                .statusCode(204);
    }

    @Test
    @Description("REGISTER - SUCCESSFUL")
    @Order(11)
    public void postRegisterSuccessfulTest() {
        String requestBody = "{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"pistol\"\n" +
                "}";
        String endPoint = "learnProject/api/register";
        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(URL + endPoint)
                .then()
                .statusCode(200);
    }

    @Test
    @Description("REGISTER - UNSUCCESSFUL")
    @Order(12)
    public void postRegisterUnsuccessfulTest() {
        String requestBody = "{\n" +
                "    \"email\": \"sydney@fife\"\n" +
                "}";
        String endPoint = "learnProject/api/register";
        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(URL + endPoint)
                .then()
                .statusCode(400);
    }


    @Test
    @Description("LOGIN - SUCCESSFUL")
    @Order(13)
    public void postLoginSuccessfulTest() {
        String requestBody = "{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"cityslicka\"\n" +
                "}";
        String endPoint = "learnProject/api/login";
        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(URL + endPoint)
                .then()
                .statusCode(200);
    }


    @Test
    @Description("LOGIN - UNSUCCESSFUL")
    @Order(14)
    public void postLoginUnsuccessfulTest() {
        String requestBody = "{\n" +
                "    \"email\": \"peter@klaven\"\n" +
                "}";
        String endPoint = "learnProject/api/login";
        given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(URL + endPoint)
                .then()
                .statusCode(400);
    }

    @Test
    @Description("DELAYED RESPONSE")
    @Order(15)
    public void getDelayedResponseTest() {
        String endPoint = "learnProject/api/users?delay=3";
        Response response =  given()
                .when()
                .get(URL + endPoint);
        assertEquals(200, response.getStatusCode());
    }
}