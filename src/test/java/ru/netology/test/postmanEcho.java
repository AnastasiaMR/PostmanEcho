package ru.netology.test;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;


public class postmanEcho {

    @Test
    public void postmanEchoTest(){
            // Given - When - Then
// Предусловия
            given()
                    .baseUri("https://postman-echo.com")
                    .body("User id") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                    .when()
                    .post("/post")
// Проверки
                    .then()
                    .statusCode(200)
                    .body("data", equalTo("User id"))
            ;
        }
}
