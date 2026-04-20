package com.ecommerce.models;

import java.util.Date;
import java.util.List;

public class Order {
    private String orderId;
    private String customerId;
    private List<String> items;
    private String status;
    private Date orderDate;
    private List<String> orderHistory;

    public Order(String orderId, String customerId, List<String> items) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.items = items;
        this.status = "Pending"; // Initial status
        this.orderDate = new Date(); // Set to current date
        this.orderHistory = new ArrayList<>();
        orderHistory.add("Order created on: " + orderDate);
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public List<String> getItems() {
        return items;
    }

    public String getStatus() {
        return status;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        orderHistory.add("Status updated to: " + newStatus + " on: " + new Date());
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public List<String> getOrderHistory() {
        return orderHistory;
    }
}