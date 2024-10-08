package behavioral_patterns.state.door;

public class ClosedState implements State {
    @Override
    public void open(Door door) {
        System.out.println("Door is now open.");
        door.setState(new OpenState());
    }

    @Override
    public void close(Door door) {
        System.out.println("Door is already closed.");
    }
}
