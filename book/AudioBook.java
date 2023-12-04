package book;

public class AudioBook extends Book {

    private final int size;
    private final int playLength;
    private final String playBack;

    public AudioBook(String title, int yearOfPublish, String author,
    int size, int playLength, String playBack) {
        super(title, yearOfPublish, author);
        
        this.size = size;
        this.playLength = playLength;
        this.playBack = playBack;
    }

    public int getSize() {
        return size;
    }

    public int getPlayLength() {
        return playLength;
    }

    public String getPlayBack() {
        return playBack;
    }

    @Override
    public String toString() {
        return String.format("%n%s%s%n %s%d%n %s%s%n %s%d%n %s%d%n %s%s%n",
        "Title: ", getTitle(),
        "Year of Publication: ", getYearOfPublish(),
        "Author: ", getAuthor(),
        "Size: ", getSize(),
        "Play Length: ", getPlayLength(),
        "Playback: ", getPlayBack()

        );
    }
    
    
}
