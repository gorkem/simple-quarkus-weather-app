package org.acme.weather;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class WeatherResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/w/boston")
          .then()
             .statusCode(200);
    }

}
