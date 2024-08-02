package creational_patterns.strategy.payment;

import org.junit.jupiter.api.Test;

class PaymentStrategyTest {

    @Test
    void strategyTest() {
        ShoppingCart creditCardCart = new ShoppingCart(new CreditCardPayment("John Doe", "1234567890123456"));
        creditCardCart.checkout(100);

        ShoppingCart payPalCart = new ShoppingCart(new PayPalPayment("johndoe@example.com"));
        payPalCart.checkout(200);
    }
}
