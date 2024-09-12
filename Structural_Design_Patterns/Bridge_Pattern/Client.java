package Bridge_Pattern;

// Client Code


public class Client {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remoteControl = new BasicRemoteControl(tv);

        remoteControl.turnOn();
        remoteControl.turnOff();

        Device radio = new Radio();
        RemoteControl radioRemote = new BasicRemoteControl(radio);

        radioRemote.turnOn();
        radioRemote.turnOff();
    }
}
