```java
public class USB {

    void connectWithUsbCable(String data) {
        System.out.println("Displaying via USB with data: " + data);
    }

}
```

```java
public class HDMI {

    void connectWithHdmiCable(int resolution) {
        System.out.println("Displaying via HDMI with resolution: " + resolution + "p");
    }
}
```


```java
public class VGA {

    void connectWithVgaCable(boolean highQuality) {
        System.out.println("Displaying via VGA with high quality: " + highQuality);
    }
}
```


```java
public interface DisplayAdapter {

    void display();

}

```


```java
public class USBAdapter implements DisplayAdapter {

    private USB usb;
    private String data;

    public USBAdapter(USB usb, String data) {
        this.usb = usb;
        this.data = data;
    }

    @Override
    public void display() {
        usb.connectWithUsbCable(data);
    }

}
```

```java
public class HDMIAdapter implements DisplayAdapter {

    private HDMI hdmi;

    private int resolution;

    public HDMIAdapter(HDMI hdmi, int resolution) {
        this.hdmi = hdmi;
        this.resolution = resolution;
    }

    @Override
    public void display() {
        hdmi.connectWithHdmiCable(resolution);
    }

}
```

```java
public class VGAAdapter implements DisplayAdapter {

    private VGA vga;

    private boolean highQuality;

    public VGAAdapter(VGA vga, boolean highQuality) {
        this.vga = vga;
        this.highQuality = highQuality;
    }

    @Override
    public void display() {
        vga.connectWithVgaCable(highQuality);
    }
}
```

```java
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
```
