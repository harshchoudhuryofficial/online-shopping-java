package com.ecommerce.payment;

public interface PaymentMethod {
    boolean processPayment(double amount);
    String getPaymentMethodName();
    boolean validatePaymentDetails();
}