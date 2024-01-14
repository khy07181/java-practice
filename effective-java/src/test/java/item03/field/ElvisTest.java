package item03.field;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ElvisTest {

    @Test
    @DisplayName("Reflection 의 AccessibleObject.setAccessible 을 사용해 private 생성자를 호출할 수 있다. "
            + "이러한 공격을 방어하려면 생성자에서 두 번째 객체가 생성되려 할 때 예외를 던지게 하면 된다.")
    void reflection() {
        try {
            Constructor<Elvis> defaultConstructor = Elvis.class.getDeclaredConstructor();
            defaultConstructor.setAccessible(true);
            Elvis elvis1 = defaultConstructor.newInstance();
            // 생성자에서 두 번째 객체가 생성되려 할 때 예외를 던진다.
            Elvis elvis2 = defaultConstructor.newInstance();
            Elvis.INSTANCE.sing();
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("Singleton class를 직렬화하려면 단순히  Serializable 을 구현하는 것만으로는 부족하다. "
            + "모든 인스턴스 필드를 transient 선언하고 readResolve() 메서드를 제공해야한다. "
            + "이렇게 하지 않으면, Deserialize 시 새로운 인스턴스가 생성된다. ")
    void serializable() {
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
            out.writeObject(Elvis.INSTANCE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))) {
            Elvis elvis3 = (Elvis) in.readObject();
            System.out.println(elvis3 == Elvis.INSTANCE);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
