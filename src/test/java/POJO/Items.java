package POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Items {
//    "orderId": 56789,
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

    @JsonProperty("productId")
    private int productId;

    @JsonProperty("productName")
    private String  productName;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("price")
    private double price;

    public Items(int productId,String productName, int quantity,double price){
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

//    List<Items> list = new ArrayList<>();



}
