public class HighLevelSupport extends Handler {
    @Override
    public void handle(Request request) {
        if (request.getType().equals("HighLevel")) {
            System.out.println("High-level support handled the request.");
        } else if (next != null) {
            next.handle(request);
        }
    }
}
