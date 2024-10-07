package creational_patterns.bridge.device;

public class TV implements Device {

    private boolean on = false;

    private int volume = 30;

    @Override
    public void tuoOn() {
        on = true;
        System.out.println("TV is now ON.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV is now OFF.");

    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV Volume is set to " + volume);
    }

    @Override
    public boolean isEnabled() {
        return on;
    }
}
