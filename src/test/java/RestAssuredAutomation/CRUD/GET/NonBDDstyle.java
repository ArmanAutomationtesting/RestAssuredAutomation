package RestAssuredAutomation.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class NonBDDstyle {
   static RequestSpecification r = RestAssured.given();

    public static void main(String[] args) {
        r.baseUri("https://api.zippopotam.us");
        test_bdd_2();

    }
    public static void test_bdd_2(){
        r.basePath("/IN/-1");
        r.when().get();
        r.then().log().all().statusCode(400);
    }
    public static void test_bdd_3(){
        r.basePath("/IN/211012");
        r.when().get();
        r.then().log().all().statusCode(201);
    }
    JsonPath jsonPath = new JsonPath("GET/BDD");

    public JsonPath getJsonPath() {
        jsonPath.getInt("[0]");

        return jsonPath;
    }
}
