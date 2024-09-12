package State_Pattern;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        StopState stopState = new StopState();

        startState.doAction(context);
        System.out.println(context.getState().getClass().getName());

        stopState.doAction(context);
        System.out.println(context.getState().getClass().getName());
    }
}
