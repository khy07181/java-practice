package structural_patterns.bridge.message;

public class TextMessage extends Message {

    protected TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        messageSender.sendMessage("Text Message: " + message);
    }
}
