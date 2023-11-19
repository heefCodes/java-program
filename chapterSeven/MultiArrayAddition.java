package chapterSeven;

public class MultiArrayAddition {
    public static void main(String[] args) {
        int [][] a = {{1, 3}, {3, 4}, {5, 6}};

        addArray(a);
    }

    public static void addArray(int[][] array) {
        int total = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                total += array[row][column];
            }
        }
        System.out.printf("Total is: %d\n", total);
    }
}
