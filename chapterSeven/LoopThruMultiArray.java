package chapterSeven;

public class LoopThruMultiArray {
    public static void main(String[] args) {
        
        int [][] a = {{1, 3}, {3, 4}, {5, 6}};
        int [][] b = {{3}, {5, 6}, {7, 8}};

        System.out.println("Values in a by row are");
        arrayOutput(a);

        System.out.printf("%nValue ina b by row are%n");
        arrayOutput(b);

    }

    public static void arrayOutput(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int colum = 0; colum < array[row].length; colum++) {
                System.out.printf("%d ", array[row][colum]);
            }
        }
    }
}
