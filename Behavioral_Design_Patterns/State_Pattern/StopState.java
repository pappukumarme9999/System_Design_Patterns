package State_Pattern;

// Concrete State

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("System is in stop state.");
        context.setState(this);
    }
}
