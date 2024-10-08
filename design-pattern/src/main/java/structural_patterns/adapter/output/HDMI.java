package structural_patterns.adapter.output;

public class HDMI {

    void connectWithHdmiCable(int resolution) {
        System.out.println("Displaying via HDMI with resolution: " + resolution + "p");
    }
}
