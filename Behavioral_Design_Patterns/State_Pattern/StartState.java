package State_Pattern;

// Concrete State

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("System is in start state.");
        context.setState(this);
    }
}
