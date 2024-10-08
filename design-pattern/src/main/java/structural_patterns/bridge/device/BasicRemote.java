package structural_patterns.bridge.device;

public class BasicRemote extends Remote {

    protected BasicRemote(Device device) {
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
}
