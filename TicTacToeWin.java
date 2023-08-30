import java.util.Arrays;

class TicTacToeWin {
  public static void main(String[] args) {
    //Board pattern to test X has a win on the second row (array index 1 is row 2)
    String[][] board = {{" - ", " O ", " X "},
                        {" X ", " X ", " X "},
                        {" O ", " O ", " - "}};
    int winningRow = checkForRowWin(board, 'X');
    if(winningRow > 0) {
      System.out.println("Win on row " + winningRow);
    }
  }

  public static int checkForRowWin(String[][] board, char player) {
    //Variable to track row that holds a win
    int rowNumber = 0;
    for(int row = 0; row < 3; row++) {
      //Temp statement to display row # as processed
      System.out.println("Checking row " + row + "(0-based count)");
      if(board[row][0].equals(" " + player + " ") &&
        board[row][1].equals(" " + player + " ") &&
        board[row][2].equals(" " + player + " ")) {
        //Add 1 to row number to match human count (starting with 1)
        rowNumber = row + 1;
        //Temporary statement to print out winning row:
        System.out.println(Arrays.toString(board[row]));
        break;
        }
    }
    //If rowNumber > 0, there is a winning row
    return rowNumber;
  }
}