package chapterSeven;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        int [] sortArray = {9, 4, 7, 6, 5};

        Arrays.sort(sortArray);
        System.out.printf("doubleArray: ");

        for (int value : sortArray) {
            System.out.printf("%d ", value);
        }

        int [] fillIntArray = new int[5];
        
        Arrays.fill(fillIntArray, 3);
        displayArray(fillIntArray, "fillIntArray");

        int [] intArray = {4, 5, 6, 7};
        int [] intArrayCopy = new int[intArray.length];

        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");
        

        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%nintArray %s intArrayCopy", (b ? "==" : "!="));

        b = Arrays.equals(intArray, fillIntArray);
        System.out.printf("%nintArray %s fillIntArray%n", (b ? "==" : "!="));

        int location = Arrays.binarySearch(intArray, 7);

        if (location >= 0) {
            System.out.printf("Found 7 at %d element%n", location);
        }
        else {
            System.out.println("7 not found in intArray%n");
        }

        location = Arrays.binarySearch(intArray, 4567);

        if (location >= 0) {
            System.out.printf("Found 4567 at %d element", location);
        }
        else {
            System.out.println("4567 not found in intArray");
        }
    }

    public static void displayArray(int[] fillIntArray, String description) {

        System.out.printf("%n%s: ", description);

        for (int value : fillIntArray) {
            System.out.printf("%d ", value);
        }
    }
}
