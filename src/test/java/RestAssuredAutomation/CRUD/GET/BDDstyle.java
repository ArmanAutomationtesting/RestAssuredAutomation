package RestAssuredAutomation.CRUD.GET;

import groovy.xml.StreamingDOMBuilder;
import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;

import java.util.ArrayList;

public class BDDstyle {
    public static void main(String[] args) {
        // GET Request - https://api.zippopotam.us/IN/560037
        // URL
        // HEADER ?
        // GET Method
        // base url = https://api.zippopotam.us
        // basePath = /IN/560037
        // PaYLOAD - ? NO
        // Auth - Basic, Digest, JWT, Bearer Token, OAuth 2.0 ? = No

        // Verification
        // Status Code
        // Response Body
        // Time, Headers ,Cookies

        // Gherkin -> Given, When, then -> Style ->

        // BDD - Framework different - Gherkin Syntax - (given, when, then)
        // Non BDD and still Gherkin syntax (using classes)


        // given ->
        // URL
        // HEADER ?, Cookies
        // base url = https://api.zippopotam.us
        // basePath = /IN/560037
        // Auth - Basic, Digest, JWT, Bearer Token, OAuth 2.0 ? = No


        // When  ->
        // PaYLOAD - ? NO/yES - JSON. XML  -> String, Hashmap, Object class
        // GET Method



        // Then()
        // Response Validation
        //  Status Code
        //  Response Body
        //  Time, Headers ,Cookies
        testbdd1();

    }
    public static void testbdd1(){
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/208001")
                .when()
                .log().all().get()
                .then()
                .assertThat()
                .log().all().statusCode(200);
    }

}