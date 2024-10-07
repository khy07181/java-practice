package creational_patterns.adapter.output;

import java.util.List;
import org.junit.jupiter.api.Test;

class DisplayAdapterTest {

    @Test
    void adapter() {
        USB usb = new USB();
        HDMI hdmi = new HDMI();
        VGA vga = new VGA();

        List<DisplayAdapter> adapters = List.of(
                new USBAdapter(usb, "Video data"),
                new HDMIAdapter(hdmi, 1080),
                new VGAAdapter(vga, true)
        );

        for (DisplayAdapter adapter : adapters) {
            adapter.display();
        }
    }

}
