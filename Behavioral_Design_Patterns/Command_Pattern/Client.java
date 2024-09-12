package Command_Pattern;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOn = new TurnOnCommand(light);
        Command turnOff = new TurnOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOn);
        remote.pressButton();  // Turns on the light

        remote.setCommand(turnOff);
        remote.pressButton();  // Turns off the light
    }
}
