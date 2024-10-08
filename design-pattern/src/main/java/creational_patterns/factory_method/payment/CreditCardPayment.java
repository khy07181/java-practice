package creational_patterns.factory_method.payment;

public class CreditCardPayment implements Payment {

    private String creditCardNumber;

    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card: $" + amount);
    }
}
