// Concrete Adaptee

public class VGAConnector implements VGA {
    @Override
    public void connectWithVGA() {
        System.out.println("Connecting with VGA connector");
    }
}