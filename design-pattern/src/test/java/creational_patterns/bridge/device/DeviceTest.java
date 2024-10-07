package creational_patterns.bridge.device;

import org.junit.jupiter.api.Test;

class DeviceTest {

    @Test
    void bridge() {
        Device tv = new TV();
        Remote basicRemote = new BasicRemote(tv);
        basicRemote.power();
        basicRemote.volumeUp();

        System.out.println();

        Device radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.power();
        advancedRemote.mute();
    }

}
