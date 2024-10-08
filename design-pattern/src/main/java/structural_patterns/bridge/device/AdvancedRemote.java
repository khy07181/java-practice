package structural_patterns.bridge.device;

public class AdvancedRemote extends Remote {

    protected AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void power() {
        if (device.isEnabled()) {
            device.turnOff();
            return;
        }
        device.tuoOn();
    }

    public void mute() {
        device.setVolume(0);
        System.out.println("Device is muted.");
    }
}
