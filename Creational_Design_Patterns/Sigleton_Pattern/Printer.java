public class Printer {
    private static volatile Printer instance;

    // Private constructor to prevent instantiation
    private Printer() {}

    public static Printer getInstance() {
        if (instance == null) {
            synchronized (Printer.class) {
                if (instance == null) {
                    instance = new Printer();
                }
            }
        }
        return instance;
    }

    public void print(String document) {
        System.out.println("Printing document: " + document);
    }
}

// Ensure lazy initialization to create the instance only when needed.
// Thread Safety: Double-checked locking ensures multiple threads do not create separate instances.
// Performance: Synchronization is only applied when the instance is created.
