import java.util.regex.Pattern;

public class PayPalPayment implements PaymentMethod {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        if (isValidEmail(email) && isValidPassword(password)) {
            this.email = email;
            this.password = password;
        } else {
            throw new IllegalArgumentException("Invalid email or password.");
        }
    }

    private boolean isValidEmail(String email) {
        // Simple regex for email validation
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(emailRegex, email);
    }

    private boolean isValidPassword(String password) {
        // Basic password validation (length check)
        return password != null && password.length() >= 8;
    }

    @Override
    public void processPayment(double amount) {
        // Implementation of payment processing via PayPal
        System.out.println("Processing payment of " + amount + " using PayPal.");
    }
}