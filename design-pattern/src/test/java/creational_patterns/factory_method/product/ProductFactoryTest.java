package creational_patterns.factory_method.product;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductFactoryTest {

    @Test
    @DisplayName("""
            ConcreteProductFactory 만 사용해 어떤 값을 넣는지에 따라 다른 Product 객체를 생성
            어떤 클래스의 객체가 만들어져 사용될지를 전적으로 Factory 에 위임함으로써 클라이언트 코드는 객체
            종류의 변화에 영향을 받지 않는 독립된 요소로 분리될 수 있다.
            """)
    void factoryMethod() {
        ProductFactory factory = new ConcreteProductFactory();

        Product electronics = factory.orderProduct("electronics");

        Product clothing = factory.orderProduct("clothing");

        Product book = factory.orderProduct("book");
    }

}
