package structural_patterns.flyweight.book;

public class Book {

    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public void read() {
        System.out.println("Reading book ttitle: " + title);
    }
}
