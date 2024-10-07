package creational_patterns.adapter.message;

import org.junit.jupiter.api.Test;

class MessageAdapterTest {

    @Test
    void adapter() {
        OldMessageSystem oldSystem = new OldMessageSystem();
        MessageAdapter adapter = new MessageAdapter(oldSystem);

        adapter.sendMessage("Hello, World!", "john@example.com");
    }

}
