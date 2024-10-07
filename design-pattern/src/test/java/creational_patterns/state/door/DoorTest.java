package creational_patterns.state.door;

import org.junit.jupiter.api.Test;

class DoorTest {

    @Test
    void state() {
        Door door = new Door();

        door.open(); // Door is now open.
        door.open(); // Door is already open.
        door.close(); // Door is now closed.
        door.close(); // Door is already closed.
    }

}
