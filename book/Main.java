package book;

public class Main {
    public static void main(String[] args) {

        AudioBook audioBook = new AudioBook("How to program", 2023, "Abdulkareem", 5, 3, "Joe");
        PrintBook printBook = new PrintBook("How to program in java", 2022, "Abdulkareem", "Tunde", "122-334-666");

        System.out.println("Audio book information");
        System.out.println(audioBook);

        System.out.println("Printed book information");
        System.out.println(printBook);
        

        
    }
    
}
