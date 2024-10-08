package creational_patterns.factory_method.product;

public class Book implements Product {
    @Override
    public void create() {
        System.out.println("Book product created.");
    }
}
