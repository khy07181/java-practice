package item03.staticfactory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConcertTest {

    @Test
    @DisplayName("Singleton 객체를 사용하여 정적 팩터리의 메서드 참조를 supplier 로 사용할 수 있다.")
    void supplier() {
        Concert concert = new Concert();
        concert.start(Elvis::getInstance);
    }

}
