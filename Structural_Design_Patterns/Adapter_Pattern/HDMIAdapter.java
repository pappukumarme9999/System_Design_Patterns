// Adapter

public class HDMIAdapter implements HDMI {
    private VGA vgaConnector;

    public HDMIAdapter(VGA vgaConnector) {
        this.vgaConnector = vgaConnector;
    }

    @Override
    public void connectWithHDMI() {
        vgaConnector.connectWithVGA();
        System.out.println("Adapter converts VGA signal to HDMI.");
    }
}
