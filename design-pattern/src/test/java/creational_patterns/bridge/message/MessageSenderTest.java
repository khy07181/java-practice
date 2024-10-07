package creational_patterns.bridge.message;

import org.junit.jupiter.api.Test;

class MessageSenderTest {

    @Test
    void bridge() {
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SMSSender();

        Message textMessage = new TextMessage(emailSender);
        textMessage.send("Hello, World!");

        Message encryptedTextMessage = new EncryptedMessage(smsSender);
        encryptedTextMessage.send("Hello, World!");
    }

}
