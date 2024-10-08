package creational_patterns.factory_method.product;

public abstract class ProductFactory {

    public abstract Product createProduct(String type);

    public Product orderProduct(String type) {
        Product product = createProduct(type);
        product.create();
        return product;
    }

}
