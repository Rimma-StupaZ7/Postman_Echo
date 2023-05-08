package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostManTestPost {
    @Test
    void QueryPostData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("John")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("John"));

    }
}
