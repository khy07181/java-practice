package creational_patterns.singleton;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.BDDAssertions.then;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Settings5Test {

    @Test
    @DisplayName("Enum 은 reflection 을 통해 private 생성자에 접근해서 생성하는 것을 막아놓았기 때문에 singleton 이 깨지지 않는다.")
    void enum_break_singleton_reflection() {
        Constructor<?>[] declaredConstructor = Settings5.class.getDeclaredConstructors();
        Constructor<?> constructor = Arrays.stream(declaredConstructor).findAny().orElseThrow();

        constructor.setAccessible(true);
        assertThatThrownBy(constructor::newInstance)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Cannot reflectively create enum objects");
    }

    @Test
    @DisplayName("Enum 은 직렬화/역직렬화를 통해 singleton 이 깨지지 않는다.")
    void enum_break_singleton_serialization() throws IOException, ClassNotFoundException {
        Settings5 instance = Settings5.INSTANCE;

        Settings5 deserializationInstance = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(instance);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            deserializationInstance = (Settings5) in.readObject();
        }

        then(instance).isEqualTo(deserializationInstance);
    }
}
