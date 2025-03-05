package POJO;

import java.util.List;

public class Payload2 {

//{
//  "orderId": 56789,
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

    private long orderID;
    private Customer customer;
    private List<Items> items;
    private long totalAmount;
    private String orderStatus;

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Payload2{" +
                "orderID=" + orderID +
                ", customer=" + customer +
                ", items=" + items +
                ", totalAmount=" + totalAmount +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
