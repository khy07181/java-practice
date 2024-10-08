package behavioral_patterns.state.door;

public class OpenState implements State {
    @Override
    public void open(Door door) {
        System.out.println("Door is already open.");
    }

    @Override
    public void close(Door door) {
        System.out.println("Door is now closed.");
        door.setState(new ClosedState());
    }
}
