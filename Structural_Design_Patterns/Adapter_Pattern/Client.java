// Client Code

public class Client {
    public static void main(String[] args) {
        VGA vgaDevice = new VGAConnector();
        HDMI adapter = new HDMIAdapter(vgaDevice);

        adapter.connectWithHDMI(); // Adapter allows VGA to connect via HDMI.
    }
}
