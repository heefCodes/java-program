package chapterSeven;

public class InitArray {
    public static void main(String[] args) {
        int [] array = new int[10];

        System.out.printf("%s%8s%n", "Index   ", "InitialValue");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%3d%8d%n", counter, array[counter]);
        }
    }
}
