// Concrete method implementing HDMI interface for the devices or systems that natively support HDMI


public class HDMIMonitor implements HDMI {
    @Override
    public void connectHDMI() {
        System.out.println("Connecting with HDMI monitor.");
    }
}


// Direct HDMI Connection: If you have a device or component that natively supports HDMI (like a modern TV or monitor), you would implement the HDMI interface in that class. 
// This makes the system more modular and flexible, allowing direct HDMI support as well as support for legacy VGA devices through the adapter.