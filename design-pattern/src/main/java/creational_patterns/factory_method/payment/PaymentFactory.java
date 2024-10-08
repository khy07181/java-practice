package creational_patterns.factory_method.payment;

public abstract class PaymentFactory {

    abstract Payment createPayment(FinancialInfo info);

}
