public class LowLevelSupport extends Handler {
    @Override
    public void handle(Request request) {
        if (request.getType().equals("LowLevel")) {
            System.out.println("Low-level support handled the request.");
        } else if (next != null) {
            next.handle(request);
        }
    }
}
