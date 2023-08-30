import java.util.Arrays; //Added to print out rows

class test2 {
  public static void main(String[] args) {
    //Board pattern to test:
    String[][] board = {{" X ", " O ", " O "},
                        {" - ", " X ", " - "},
                        {" - ", " - ", " X "}};
    //int winningCol = checkForColumnWin(board, 'O');
    //if(winningCol > 0) {
    //System.out.println("Win on column " + winningCol);
  }
  
 public static int checkForColumnWin(String[][] board, char player) {
   // Variable to track row that holds a win
   int colNumber = 0;
   for(int col = 0; col < 3; col++) {
     if(board[0][col].equals(" " + player + " ") && 
        board[1][col].equals(" " + player + " ") && 
        board[2][col].equals(" " + player + " ")) {
       // Correct for human count (starting with 1, not 0)
       colNumber = col + 1;
       break;
     }
   }
   // If colNumber > 0, there is a winning row
   return colNumber;
 }
}