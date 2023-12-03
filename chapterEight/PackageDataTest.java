package chapterEight;

public class PackageDataTest {
    public static void main(String[] args) {
        PackageDate packageDate = new PackageDate();

        System.out.printf("After instantiation:%n%s%n", packageDate);

        packageDate.number = 77;
        packageDate.string = "Goodbye";

        System.out.printf("%nAfter changing values:%n%s%n", packageDate);


    }
}

class PackageDate{
    int number = 0;
    String string = "Hello";

    public String toString() {
        return String.format("number: %d; string: %s", number, string);
    }
}
