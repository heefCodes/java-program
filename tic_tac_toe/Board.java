package tic_tac_toe;

public class Board {
    private static Position position = Position.EMPTY;
    private static char [][] boardElement = new char[3][3];

   public void displayBoard(){
    for (int i = 0; i < 3; i++) {
        if (i == 1 || i == 2) {
            System.out.println("______________");
        }
        for (int j = 0; j < 3; j++) {
            System.out.print(cellToChar(boardElement[i][j]));
            if (j < 2){
                System.out.print(" | ");
            }
        }
        System.out.println();
    }
   }

private char[] cellToChar(char c) {
    if (c == Position.X) {
        
    }
    return null;
}
}
