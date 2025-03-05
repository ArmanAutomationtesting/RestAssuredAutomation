package Hashmap;

import POJO.Payload2;
import POJO.Payloaf1;
import com.google.gson.Gson;

import java.util.*;

public class PayloadCreationUsingHashmap {


    public static void main(String[] args) {
        PayloadCreationUsingHashmap payloadCreationUsingHashmap = new PayloadCreationUsingHashmap();
        payloadCreationUsingHashmap.payload1();
    }
    public String payload1(){
        HashMap<String,Object> customer = new HashMap<>();
        customer.put("id",101);
        customer.put("name","John Doe");
        customer.put("email","arman@gmail.com");


        List<HashMap<String, Object>> finalItem = getHashMaps();

        HashMap<String,Object> finalone = new HashMap<>();
        finalone.put("orderId",73733);
        finalone.put("customer",customer);
        finalone.put("items",finalItem);
        finalone.put("totalAmount",83838);
        finalone.put("orderStatus", "Completed");

        Gson gson = new Gson();
        String payload123 = gson.toJson(finalone);
        System.out.println(payload123);
        return payload123;
    }

    private static List<HashMap<String, Object>> getHashMaps() {
        HashMap<String,Object> Item1 = new HashMap<>();
        Item1.put("productId",1234);
        Item1.put("productName","Laptop");
        Item1.put("quantity",1);
        Item1.put("price",1200.99);

        HashMap<String,Object> Item2 = new HashMap<>();
        Item2.put("productId",5353);
        Item2.put("productName","Mouse");
        Item2.put("quantity",2);
        Item2.put("price",1222.99);

        List<HashMap<String,Object>> finalItem = new ArrayList<>();
        finalItem.add(Item1);
        finalItem.add(Item2);
        return finalItem;
    }
    //"orderId": 56789,
    //  "customer": {
    //    "id": 101,
    //    "name": "John Doe",
    //    "email": "john.doe@example.com"
    //  },
    //  "items": [
    //    {
    //      "productId": 1234,
    //      "productName": "Laptop",
    //      "quantity": 1,
    //      "price": 1200.99
    //    },
    //    {
    //      "productId": 5678,
    //      "productName": "Mouse",
    //      "quantity": 2,
    //      "price": 25.50
    //    }
    //  ],
    //  "totalAmount": 1251.99,
    //  "orderStatus": "Processing"
    //}




}
