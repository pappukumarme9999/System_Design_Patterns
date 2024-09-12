package State_Pattern;

// Context Class

public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void request() {
        state.doAction(this);
    }
}
