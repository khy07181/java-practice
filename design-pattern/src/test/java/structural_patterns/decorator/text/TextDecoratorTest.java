package structural_patterns.decorator.text;

import org.junit.jupiter.api.Test;

class TextDecoratorTest {

    @Test
    void decorator() {
        Text text = new PlainText("Hello, Decorator Pattern!");
        System.out.println("Plain text: " + text.getContent());

        text = new BoldDecorator(text);
        System.out.println("Bold text: " + text.getContent());

        text = new ItalicDecorator(text);
        System.out.println("Bold and Italic text: " + text.getContent());

        text = new UnderlineDecorator(text);
        System.out.println("Bold, Italic and Underline text: " + text.getContent());

        Text anotherText = new UnderlineDecorator(new ItalicDecorator(new PlainText("Another example")));
        System.out.println("Underline and Italic text: " + anotherText.getContent());
    }
}
