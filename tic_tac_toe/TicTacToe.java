package tic_tac_toe;

public class TicTacToe {
    private char [][] array = new char[3][3];
    private Position position = Position.EMPTY;
    private Board[][] board;


    public TicTacToe() {
        this.board = new Board[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Board.
            }
        }
    
    }


    public char[][] getArray() {
        return array;
    }


    public void setArray(char[][] array) {
        this.array = array;
    }


    public Position getPosition() {
        return position;
    }


    public void setPosition(Position position) {
        this.position = position;
    }


    public Board[][]Board() {
        return board;
    }


    public void setBoard(Board[][] board) {
        this.board = board;
    }
    

}
