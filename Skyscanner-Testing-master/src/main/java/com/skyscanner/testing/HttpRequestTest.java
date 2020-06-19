package com.skyscanner.testing;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;

@RunWith(SpringRunner.class)

public class HttpRequestTest {


    @Before
    public void setup() {
        RestAssured.baseURI = "https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/browsequotes/v1.0";
    }

    @Test
    public void nesto() {

        given()
                .header("X-RapidAPI-Key", "aa28aeea8emsh7041bb299aaa9f0p16245ajsncfa0f27e654e")
                    .when()
                        .get("/US/USD/en-US/MUC-sky/FRA-sky/2020-07-02")
                             .then().statusCode(200);
    }
//    @Test
//    public void greetingShouldReturnDefaultMessage() throws Exception {
//
//        final HttpHeaders headers = new HttpHeaders();
//
//        headers.set("X-RapidAPI-Key", "aa28aeea8emsh7041bb299aaa9f0p16245ajsncfa0f27e654e");
//
//        assertThat(this.restTemplate.exchange("https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/browsequotes/v1.0/US/USD/en-US/MUC-sky/FRA-sky/2020-07-02",
//                HttpMethod.GET,
//                new HttpEntity<>(headers),
//                String.class).getStatusCode()).isEqualTo(HttpStatus.OK);
//    }
//

}