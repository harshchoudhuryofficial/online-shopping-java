package com.ecommerce.payment;

public class CreditCardPayment implements PaymentMethod {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public boolean validate() {
        // Basic validation for card number and CVV
        return isValidCardNumber(cardNumber) && isValidCVV(cvv);
    }

    @Override
    public void processPayment(double amount) {
        if (validate()) {
            System.out.println("Processing payment of " + amount + " using Credit Card.");
            // Simulate payment processing logic
        } else {
            System.out.println("Invalid credit card details.");
        }
    }

    private boolean isValidCardNumber(String cardNumber) {
        // Implement Luhn algorithm or other validation logic
        return cardNumber != null && cardNumber.matches("\d{16}");
    }

    private boolean isValidCVV(String cvv) {
        // Validate CVV
        return cvv != null && cvv.matches("\d{3}");
    }
}