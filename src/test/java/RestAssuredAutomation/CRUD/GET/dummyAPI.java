package RestAssuredAutomation.CRUD.GET;

import POJO.Payloaf1;
import PayloadManager.PayloadManager;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dummyAPI   {
    PayloadManager payloadManager = new PayloadManager();
    public RequestSpecification requestSpecification;
 public Response response;
    @Test
    public void Getrequest(){
        requestSpecification = new RequestSpecBuilder().
        setBaseUri("https://dummy-json.mock.beeceptor.com")
                .setBasePath("/continents").build().log().all();

        response = RestAssured.given(requestSpecification).when().log().all().get();

        ValidatableResponse validatableResponse = response.then().log().all().statusCode(200);



    }

    @Test
    public void Postrequest(){

        Payloaf1 payloaf1 = new Payloaf1();
        String payload = "{\n" +
                "   \"name\": \"Apple MacBook Pro 16\",\n" +
                "   \"data\": {\n" +
                "      \"year\": 2019,\n" +
                "      \"price\": 1849.99,\n" +
                "      \"CPU model\": \"Intel Core i9\",\n" +
                "      \"Hard disk size\": \"1 TB\"\n" +
                "   }\n" +
                "}";
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://api.restful-api.dev")
                .setBasePath("/objects")
                .setContentType(ContentType.JSON)
                .addHeader("Content-type","application/json").build();
        response = RestAssured.given(requestSpecification).log().all()
                .when().body(payloadManager.get_Payload()).post();

        ValidatableResponse validatableResponse = response.then().log().all().statusCode(200);

        String response1 = response.getBody().asString();
        JsonPath jsonPath = new JsonPath(response1);
       int path =  jsonPath.getInt("data.year");

       Assert.assertEquals(path,2025);
    }
}