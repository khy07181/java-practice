package creational_patterns.singleton;

import static org.assertj.core.api.BDDAssertions.then;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Settings4Test {

    @Test
    @DisplayName("reflection 을 통해 private 생성자에 접근하면 singleton 이 깨질 수 있다.")
    void break_singleton_reflection()
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings4 instance = Settings4.getInstance();

        Constructor<Settings4> constructor = Settings4.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings4 newInstance = constructor.newInstance();

        then(instance).isNotEqualTo(newInstance);
    }

    @Disabled("Serializable 인터페이스를 구현해야 통과한다.")
    @Test
    @DisplayName("Settings4 클래스에 Serializable 인터페이스를 구현하면 직렬화/역직렬화를 통해 singleton 이 깨질 수 있다.")
    void break_singleton_serialization() throws IOException, ClassNotFoundException {
        Settings4 instance = Settings4.getInstance();

        Settings4 deserializationInstance = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(instance);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            deserializationInstance = (Settings4) in.readObject();
        }

        then(instance).isNotEqualTo(deserializationInstance);
    }

}
