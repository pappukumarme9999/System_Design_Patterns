public class Client {
    public static void main(String[] args) {
        Handler lowLevel = new LowLevelSupport();
        Handler highLevel = new HighLevelSupport();

        lowLevel.setNext(highLevel);

        Request request = new Request("HighLevel");
        lowLevel.handle(request);  // High-level support will handle this
    }
}
