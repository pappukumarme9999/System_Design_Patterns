// Client Code


public class Client {
    public static void main(String[] args) {
        // VGA device
        VGA vgaDevice = new VGAConnector();
        // HDMI device
        HDMI hdmiDevice = new HDMIMonitor();
        
        // Adapter to convert VGA to HDMI
        HDMI adapter = new HDMIAdapter(vgaDevice);

        // HDMI device connects directly
        hdmiDevice.connectHDMI();  // Output: Connecting with HDMI monitor.
        
        // VGA device connects via adapter
        adapter.connectHDMI(); // Output: Connecting with VGA connector.
                                   //         Adapter converts VGA signal to HDMI.
    }
}
