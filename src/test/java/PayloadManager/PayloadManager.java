package PayloadManager;

import POJO.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PayloadManager {

    //{
    //    //    "name": "Apple MacBook Pro 16",
    //    //    "data": {
    //    //        "year": 2019,
    //    //        "price": 1849.99,
    //    //        "CPU model": "Intel Core i9",
    //    //        "Hard disk size": "1 TB"
    //    //    }

    public  String get_Payload(){
        Payloaf1 payloaf1 = new Payloaf1();
        payloaf1.setName("HP solid");
        Data data = new Data();
        data.setCPUModel("Intel core i7");
        data.setHardDiskSize("500 GB");
        data.setYear(2025);
        data.setPrice(360.37);
        payloaf1.setData(data);
        Gson gson = new Gson();
        String json_payload = gson.toJson(payloaf1);
        System.out.println(json_payload);
        return json_payload;
    }

    public String getPayload2() throws JsonProcessingException {
        List<Items> list = new ArrayList<>();
        Items item1 = new Items(1234,"Laptop", 1,1200.99);
        Items item2 = new Items(5678,"Mouse", 2,25.50);
        list.add(item1);
        list.add(item2);
        Payload2 payload = new Payload2();
        payload.setOrderID(27363);
        Customer customer = new Customer();
        customer.setId(221);
        customer.setName("arman");
        customer.setEmail("hello@123");
        payload.setCustomer(customer);
        payload.setItems(list);
        payload.setTotalAmount(35334);
        payload.setOrderStatus("Completed");

        System.out.println(payload.toString());
//        Gson gson = new Gson();
        String json_payload = new ObjectMapper().writeValueAsString(payload);
        System.out.println(json_payload);
        return  json_payload;
    }

    public String putPayload() throws IOException {
//        PutPayload putPayload = new PutPayload();
//        putPayload.setJob("zion resident");
//        putPayload.setName("Arman");
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.writeValueAsString(putPayload);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File("C:\\Users\\ahmad\\IdeaProjects\\RestAssuredAutomation\\src\\test\\resources\\TestJson.json"));
       String putPayload = jsonNode.toPrettyString();
        return putPayload;
    }

//    public String Payload3Test(){
//
//        return  Payload3Final;
//    }

    public static void main(String[] args) throws JsonProcessingException {
        PayloadManager payloadManager = new PayloadManager();
        payloadManager.getPayload2();
//        payloadManager.Payload3Test();

    }


}
