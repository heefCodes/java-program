package book;

public class PrintBook extends Book {
    private final String publisher;
    private final String isbn;

    public PrintBook(String title, int yearOfPublish, String author, String publisher, String isbn) {
        super(title, yearOfPublish, author);

        this.publisher = publisher;
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return String.format("%n%s%s%n %s%d%n %s%s%n %s%s%n %s%s%n",
        "Title: ", getTitle(),
        "Year of Publication: ", getYearOfPublish(),
        "Author: ", getAuthor(),
        "Publisher: ", getPublisher(),
        "Isbn: ", getIsbn());
    }
    
}
