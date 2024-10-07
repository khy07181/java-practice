package creational_patterns.bridge.device;

public interface Device {
    void tuoOn();

    void turnOff();

    void setVolume(int volume);

    boolean isEnabled();
}
