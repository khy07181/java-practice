package creational_patterns.factory_method.payment;

import org.junit.jupiter.api.Test;

class PaymentFactoryTest {

    @Test
    void factoryMethod() {
        FinancialInfo info = new FinancialInfo(
                "1234-5678-9012-3456",
                "user@example.com",
                "987654321"
        );

        PaymentFactory factory = new CreditCardPaymentFactory();
        Payment payment = factory.createPayment(info);
        payment.processPayment(100.0);

        factory = new PayPalPaymentFactory();
        payment = factory.createPayment(info);
        payment.processPayment(200.0);

        factory = new BankTransferPaymentFactory();
        payment = factory.createPayment(info);
        payment.processPayment(300.0);
    }

}
