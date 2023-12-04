package book;

public class Book extends Object{

    private final String title;
    private final int yearOfPublish;
    private final String author;


    public Book(String title, int yearOfPublish, String author) {
        this.title = title;
        this.yearOfPublish = yearOfPublish;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }


    public int getYearOfPublish() {
        return yearOfPublish;
    }


    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("%s %s%n %s %s%n %s %s%n",
        "Title: ", getTitle(),
        "Year of Publication: ", getYearOfPublish(),
        "Author: ", getAuthor());
    }
    
    
}
