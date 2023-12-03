package chapterEight;

public enum Book {
    //declare constants of enum type
    JHTP("Java How to Program", "2018"),
    CHTP("C How to Program", "2016"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2017"),
    VBHTP("Visaul Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2017");

    private final String title;
    private final String copyrightYear;
    
    private Book(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }

    
}
