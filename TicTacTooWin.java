import java.util.Arrays; //Added to print out rows

class TicTacTooWin {
  public static void main(String[] args) {
    //Board pattern to test:
    String[][] board = {{" X ", " O ", " X "},
                        {" X ", " O ", " X "},
                        {" O ", " O ", " - "}};
    int winningCol = checkForColumnWin(board, 'O');
    if(winningCol > 0) {
      System.out.println("Win on column " + winningCol);
    }
  }

  public static int checkForColumnWin(String[][] board, char player) {
    //Variable to track column that holds a win
    int colNumber = 0;
    for(int col = 0; col < 3; col++) {
      //Temp statement to display column # as processed
      //System.out.println("Checking col " + col + "=");
      //System.out.println(board[col][0] + "\n" + board[col][1] + "\n" + board[col][2]);
      if(board[0][col].equals(" " + player + " ") &&
        board[1][col].equals(" " + player + " ") &&
        board[2][col].equals(" " + player + " ")) {
        //Add 1 to col number to match human count (starting with 1)
        colNumber = col + 1;
        //Temporary statement to print out winning row:
        //System.out.println(Arrays.toString(board[row]));
        //System.out.println("Col:\n"+ board[0][col] + "\n" + board[1][col] + "\n" + board[2][col]);
        break;
        }
    }
    //If colNumber > 0, there is a winning row
    //System.out.println("colNumber:" + colNumber);
    return colNumber;
  }
}