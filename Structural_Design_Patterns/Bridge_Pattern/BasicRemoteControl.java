package Bridge_Pattern;

// Concrete Abstraction

public class BasicRemoteControl extends RemoteControl {
    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Remote: power on");
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Remote: power off");
        device.turnOff();
    }
}