package RestAssuredAutomation.CRUD.GET;

import POJO.Payload1Response;
import POJO.Payloaf1;
import POJO.PutPayloadResponse;
import PayloadManager.PayloadManager;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.stream.IntStream;


public class dummyAPI   {
    PayloadManager payloadManager = new PayloadManager();
    public RequestSpecification requestSpecification;
    public Response response;


    @Description("HelloTest")
    @Test(priority = 0)
    public void Getrequest(){
        requestSpecification = new RequestSpecBuilder().
        setBaseUri("https://dummy-json.mock.beeceptor.com")
                .setBasePath("/continents").build().log().all();

        response = RestAssured.given(requestSpecification).when().log().all().get();

        ValidatableResponse validatableResponse = response.then().log().all().statusCode(200);
    }


    @Test(dependsOnMethods = "Getrequest")
    public void PutRequest() throws IOException {
        Properties prop = new Properties();
        FileInputStream fil = new FileInputStream("C:\\Users\\ahmad\\IdeaProjects\\RestAssuredAutomation\\src\\test\\resources\\Test.properties");
        prop.load(fil);

        IntStream.rangeClosed(1,1).forEach(i -> {
            Map<String,Object> map = new HashMap<>();
            map.put("name",prop.getProperty("name" + i));
            map.put("job",prop.getProperty("job"+ i ));
            String payload = new Gson().toJson(map);
            requestSpecification = new RequestSpecBuilder()
                    .setBaseUri("https://reqres.in/")
                    .setBasePath("/api/users/2")
                    .build();
            response = RestAssured.given(requestSpecification)
                    .when().body(payload).log().all().put();



            ValidatableResponse validatableResponse = response.then().log().all();
        });


    }

    @Test(priority = 0)
    public void Postrequest() throws JsonProcessingException {

//        Payloaf1 payloaf1 = new Payloaf1();
//        String payload = "{\n" +
//                "   \"name\": \"Apple MacBook Pro 16\",\n" +
//                "   \"data\": {\n" +
//                "      \"year\": 2019,\n" +
//                "      \"price\": 1849.99,\n" +
//                "      \"CPU model\": \"Intel Core i9\",\n" +
//                "      \"Hard disk size\": \"1 TB\"\n" +
//                "   }\n" +
//                "}";
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

       ObjectMapper objectMapper = new ObjectMapper();
        Payload1Response payload1Response  = objectMapper.readValue(response1,Payload1Response.class);
        System.out.println(payload1Response.getData().getCPUModel());

       Assert.assertEquals(path,2025);
    }

    @Test(priority = 2)
    public void TestPayloadPut() throws IOException {
//        String putPayload = "{\n" +
//                "    \"name\": \"morpheus\",\n" +
//                "    \"job\": \"zion resident\"\n" +
//                "}";
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setBasePath("/api/users/2").setContentType(ContentType.JSON)
                .addHeader("Content-type","application/json").build();
        response = RestAssured.given(requestSpecification)
                .when().body(payloadManager.putPayload()).log().all()
                .put();
        ValidatableResponse validatableResponse = response.then().log().all();

        String response123 = response.getBody().asString();
        System.out.println(response123);

//        Gson gson = new Gson();
//        PutPayloadResponse putPayloadResponse = gson.fromJson(response123,PutPayloadResponse.class);
        ObjectMapper objectMapper = new ObjectMapper();
        PutPayloadResponse putPayloadResponse1 = objectMapper.readValue(response123,PutPayloadResponse.class);
        System.out.println(putPayloadResponse1.getUpdatedAt());
//        ObjectMapper ObjectMapper = new ObjectMapper();
//
//        PutPayloadResponse putPayloadResponse = null;
//        try {
//            putPayloadResponse = objectMapper.readValue(response123, PutPayloadResponse.class);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(putPayloadResponse.getUpdatedAt());

    }
}