package creational_patterns.adapter.output;

public class VGA {

    void connectWithVgaCable(boolean highQuality) {
        System.out.println("Displaying via VGA with high quality: " + highQuality);
    }
}
