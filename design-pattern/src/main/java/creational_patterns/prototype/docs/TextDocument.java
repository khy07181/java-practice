package creational_patterns.prototype.docs;

public class TextDocument implements Document {

    private String content;

    public TextDocument(String content) {
        this.content = content;
    }

    @Override
    public Prototype clone() {
        return new TextDocument(this.content);
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

}
