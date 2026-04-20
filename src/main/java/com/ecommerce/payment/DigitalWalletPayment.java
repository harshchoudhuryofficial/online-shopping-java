package com.ecommerce.payment;

public class DigitalWalletPayment implements PaymentMethod {
    private double walletBalance;

    public DigitalWalletPayment(double initialBalance) {
        this.walletBalance = initialBalance;
    }

    public void addFunds(double amount) {
        if (amount > 0) {
            walletBalance += amount;
        }
    }

    public boolean makePayment(double amount) {
        if (amount > 0 && amount <= walletBalance) {
            walletBalance -= amount;
            return true; // Payment successful
        }
        return false; // Payment failed
    }

    public double checkBalance() {
        return walletBalance;
    }
}