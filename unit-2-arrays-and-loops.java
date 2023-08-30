class PetsArray {
  public static void main(String[] args) {
    String[] pets = {"dog", "cat", "fish"};
    System.out.println(pets[1]);
  }
}



import java.util.Scanner;

class PetsArrayTest {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String[] petList = {"dog", "cat", "fish"};
    System.out.println("Select a pet: ");
    System.out.println("1. " + petList[0]);
    System.out.println("2. " + petList[1]);
    System.out.println("3. " + petList[2]);
    System.out.print("Enter a selection #: ");
    //Declare the variable choice before try block so it can be used later in program.
    int choice = 0;
    try {
      choice = input.nextInt();
    }
    catch(Exception ex) { //If user doesn't enter a number
      System.out.println("That's not a number");
    }    
    //Subtract 1 from choice
    choice--;
    //try to access element in array
    try {
      System.out.println("You selected a " + petList[choice]);
    }
    catch(ArrayIndexOutOfBoundsException ex) { //Number out of range
      System.out.println("Not a valid selection");
    }
  }
}



class NumbersArray {
  public static void main(String[] args) {
    int[] numbers = {17, 123};
    System.out.println(numbers[0] + ", " + numbers[1]);
    numbers[1] = 5;
    System.out.println(numbers[0] + ", " + numbers[1]);
  }
}



import java.util.Arrays;

class ChangeWholeArray {
  public static void main(String[] args) {
    //Original array contents
    int[] numbers = {1, 2, 3};
    System.out.println("Array contents: " + Arrays.toString(numbers));
    //Try to change whole array
    //numbers = {4, 5, 6}; produces error
    numbers = new int[]{4, 5, 6}; //is correct
    System.out.println("New array contents: " + Arrays.toString(numbers));
  }
}



import java.util.Arrays;

class FinalArray {
  public static void main(String[] args) {
   //Original array - declared final (constant)
    final int[] numbers = {1,2,3};
    System.out.println("Array contents: " + Arrays.toString(numbers));
    //Assign new values to individual elements
    numbers[0] = 4;
    numbers[1] = 5;
    numbers[2] = 6;
    System.out.println("New array contents: " + Arrays.toString(numbers));
  }
}



import java.util.Arrays;

class FinalArrayError {
  public static void main(String[] args) {
    //Original array - declared final (constant)
    final int[] numbers = {1, 2, 3};
    System.out.println("Array contents: " + Arrays.toString(numbers));
    //Assign new array
    numbers = new int[]{4, 5, 6};
    System.out.println("New array contents: " + Arrays.toString(numbers));
    //This code doesn't work, final can't be changed in array, only in individual
  }
}



import java.util.Arrays;

class PetArray {
  public static void main(String[] args) {
    String[] petlist = {"dog", "kitten", "snake"};
    petlist[1] = "kitten";
    System.out.println(Arrays.toString(petlist));
  }
}



import java.util.Arrays;

class PetsArraySort {
  public static void main(String[] args) {
    String[] petsArray = {"dog", "cat", "fish", "rabbit", "hamster", "bird", "snake"};
    System.out.println("Original array: " + Arrays.toString(petsArray));
    Arrays.sort(petsArray);
    System.out.println("Sorted array: " + Arrays.toString(petsArray));
  }
}



import java.util.Arrays;

class NumbersArraySort {
  public static void main(String[] args) {
    int[] numArray = {2, 45, 9, 17, 1, 2};
    System.out.println("Original Array: " + Arrays.toString(numArray));
    Arrays.sort(numArray);
    System.out.println("Sorted Array: " + Arrays.toString(numArray));
  }
}



import java.util.Arrays;

class ArraySort {
  public static void main(String[] args) {
  //Declare and initialize array with values
  int[] scores = {77, 89, 100, 68, 95};
  //System.out.println("Incorrect way to print: " + scores);
  System.out.println("Scores: " + Arrays.toString(scores));
  Arrays.sort(scores);
  System.out.println("Sorted scores: " + Arrays.toString(scores));
  //Use the length property (or attribute) to get size of array
  int size = scores.length;
  System.out.println("Array size: " + size);
  //Element 0 contains the lowest value
  System.out.println("Lowest score:" + scores[0]);
  //Last index is 1 less than the size
  int lastIndex = size - 1;
    System.out.println("Highest score: " + scores[lastIndex]);
  }
}



import java.util.Arrays;

class ArrayCopy {
  public static void main(String[] args) {
    //Original array of 5 integers
    int[] scores = {77, 89, 100, 68, 95};
    System.out.println("Original: " + Arrays.toString(scores));
    //Copy larger array of 10 integers back to scores
    scores = Arrays.copyOf(scores, 10);
    System.out.println("Enlarged: " + Arrays.toString(scores));
  }
}



import java.util.Arrays;

class BinarySearch {
  public static void main(String[] args) {
    int[] scores = {77, 89, 100, 68, 95};
    int searchValue = 100;
    Arrays.sort(scores);
    System.out.println("Sorted Array: " + Arrays.toString(scores));
    int location = Arrays.binarySearch(scores, searchValue);
    if(location > -1) {
      System.out.println(searchValue + " found");
    }
    else {
      System.out.println(searchValue + " not found");
    }
  }
}



import java.util.Arrays;

class ArraySort {
  public static void main(String[] args) {
  //Declare and initialize array with values
  int[] scores = {77, 89, 100, 68, 95};
  //System.out.println("Incorrect way to print: " + scores);
  System.out.println("Scores: " + Arrays.toString(scores));
  Arrays.sort(scores);
  System.out.println("Sorted scores: " + Arrays.toString(scores));
  //Use the length property (or attribute) to get size of array
  int size = scores.length;
  System.out.println("Array size: " + size);
  //Element 0 contains the lowest value
  System.out.println("Lowest score:" + scores[0]);
  //Last index is 1 less than the size
  int lastIndex = size - 1;
    System.out.println("Highest score: " + scores[lastIndex]);
  }
}



import java.util.Arrays;

class ArrayCopyOfRange {
  public static void main(String[] args) {
    //Original array of 5 integers
    int[] scores = {77, 89, 100, 68, 95};
    System.out.println("Original: " + Arrays.toString(scores));
    Arrays.sort(scores);
    System.out.println("Sorted: " + Arrays.toString(scores));
    //start is 3rd from end, runs until the end - 1
    int[] topThree = Arrays.copyOfRange(scores, scores.length - 3, scores.length);
    System.out.println("Top 3: " + Arrays.toString(topThree));
  }
}



import java.util.Arrays;

public class GenericMethod {

  //The angle brackets <> indicate a generic method.
  //T is a type variable that stands for the data type. The method returns a value of the same data type as the data type for the array.
  public static <T> T getMidPointItem(T[] array) {
    //division of an int by an int results in an int quotient - no decimal.
    //Returns array element at index length / 2.
    return array[array.length / 2];
  }

  public static void main(String[] args) {
    String[] names = {"Ann", "George", "Kim", "Pat", "Steve"};
    String midPointName = getMidPointItem(names);
    System.out.print("The middle item in the array " + Arrays.toString(names));
    System.out.println(" is " + midPointName);

    //Instead of primitive type char, use Character - note capital C
    Character[] letters = {'a', 'b', 'c'};
    char midPointLetter = getMidPointItem(letters);
    System.out.print("The middle item in the array " + Arrays.toString(letters));
    System.out.println(" is "+ midPointLetter);

    //Instead of primitive type int use Integer - note capital I
    Integer[] agesInYears = {27, 33, 33, 39, 40, 40, 42, 45};
    int midPointAge = getMidPointItem(agesInYears);
    System.out.print("The middle item in the array " + Arrays.toString(agesInYears));
    System.out.println(" is " + midPointAge);

    //Instead of primitive type double use Double - note capital D
    Double[] temperatures = {10.0, 21.5, 22.3, 25.0, 31.85, 35.99};
    double midPointTemp = getMidPointItem(temperatures);
    System.out.print("The middle item in the array " + Arrays.toString(temperatures));
    System.out.println(" is " + midPointTemp);
  }
}



import java.util.ArrayList;
import java.util.Collections;

class ArrayListScores {
  public static void main(String[] args) {
    //Construct an ArrayList named scores to hold Integer values
    ArrayList<Integer> scores = new ArrayList<>();
    //Add some scores
    scores.add(99);
    scores.add(88);
    scores.add(100);
    scores.add(85);
    System.out.println("First score: " + scores.get(0));
    int listLength = scores.size();
    System.out.println("Last score: " + scores.get(listLength - 1));
    Collections.sort(scores);
    System.out.println("Lowest score: " + scores.get(0));
    System.out.println("Highest score: " + scores.get(listLength - 1));
  }
}



import java.util.HashSet;
import java.util.Scanner;

public class PetsHashSet {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    HashSet<String> petSet = new HashSet<>();
    petSet.add("snake");
    petSet.add("cat");
    petSet.add("fish");
    petSet.add("dog");
    petSet.add("dog"); //duplicate accepted but will not be kept
    System.out.println("There are " + petSet.size() + " pets in the HashSet");
    System.out.println("Pets: " + petSet.toString());

    System.out.print("Enter a type of pet: ");
    String pet = input.nextLine();
    //convert entry to lowercase
    pet = pet.toLowerCase();
    //contains() returns true if value is present in set, otherwise false 
    if(petSet.contains(pet)) {
      System.out.println("The HashSet contains " + pet);
    }
    else {
      System.out.println("The HashSet doesn't contain " + pet);
    }
   }
}



import java.util.HashMap;
import java.util.Scanner;

public class ScoresHashMap {

  public static void main(String[] args) {
    //HashMap holds key-value pairs. The key (user ID) is a String (case sensitive). The value (score) is an Integer (int).
    HashMap<String, Integer> scores = new HashMap<>();
    scores.put("ssmith04", 88);
    scores.put("tlang01", 100);
    scores.put("glewis03", 99);
    System.out.println("Scores: " + scores.toString());

    Scanner input = new Scanner(System.in);

    System.out.print("Enter an ID: ");
    String id = input.nextLine();
    //Check if the HashMap contains the key(id)
    if(scores.containsKey(id)) {
      //Only safe to use get() to retrieve value if key exists in HashMap
      int score = scores.get(id);
      System.out.println(id + " has a score of " + score);
    }
    else {
      System.out.println("There is no score for " + id);
    }
  }
}



import java.util.Arrays;

class Scores2DArray {
  public static void main(String[] args) {
    //Array of 3 rows & 4 columns. 2 pairs of square brackets declare 2D array of int.
    int[][] scores = {
    {100, 92, 99, 85},
      {100, 95, 88, 91},
      {99, 100, 100, 100}
    };
    System.out.println(Arrays.deepToString(scores));
  }
}



import java.util.Arrays;

class Scores2DArray {
  public static void main(String[] args) {
    // Array of 3 rows & 4 columns
    // 2 pairs of square brackets declare 2D array of int
    int[][] scores = new int[3][4];
    // Assign a 1D array to each row in the 2D array
    scores[0] = new int[] {100, 92, 99, 85};
    scores[1] = new int[] {100, 95, 88, 91};
    scores[2] = new int[] {99, 100, 100, 100};
    // Print out just the first row as a 1-dimensional array
    System.out.println(Arrays.toString(scores[0]));
  }
}



import java.util.ArrayList;
import java.util.Scanner;

class ArrayListIndexRange {
  public static void main(String[] args) {
  ArrayList<String> choices = new ArrayList<>();
  //Add as many choices as needed, ArrayList grows to fit.
  choices.add("coffee");
  choices.add("tea");
  choices.add("water");
  System.out.println("1. " + choices.get(0));
  System.out.println("2. " + choices.get(1));
  System.out.println("3. " + choices.get(2));

  Scanner input = new Scanner(System.in);
  System.out.print("Enter a selection: ");
  int selection = input.nextInt();
  //Subtract 1 from menu choice to get index
  int index = selection - 1;
  if(index >= 0 && index < choices.size()) {
    System.out.println("You selected " + choices.get(selection - 1));
  }
    else {
    System.out.println("Not a valid selection");
    }
  }
}



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class TicTacToeBoard {
  public static void main(String[] args) {
    //to test code snippets
    int col;
    int row;
    Scanner input = new Scanner(System.in);
    
    String[][] board = {{" - ", " - ", " - "},
                        {" - ", " - ", " - "},
                        {" - ", " - ", " - "}};  
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");
    System.out.print("X - Select row (0 - 2) & select column (0 - 2) ");
    System.out.print("separated by a space: "); 
    row = input.nextInt();
    col = input.nextInt();
    board[row][col] = " X ";
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");
  }
}


import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeTurns {
  
  public static void main(String[] args) {
    String[][] board = {{" - ", " - ", " - "},
                        {" - ", " - ", " - "},
                        {" - ", " - ", " - "}};
    
    //The leading tab chars (\t) indent the board
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    //The \n adds a blank line below the board
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");

    Scanner input = new Scanner(System.in);
    int col;
    int row;

    //Display prompt text, X's first turn
    System.out.print("X - Select row (1 - 3) & select column (1 - 3) ");
    //Space separates row & column
    System.out.print("separated by a space: "); 
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " X ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");
    
    //O's 1st turn
    System.out.print("O - Select row (1-3) & select column (1-3) ");
    System.out.print("separated by a space: ");
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " O ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");
    
    //X's 2nd turn
    System.out.print("X - Select row (1 - 3) & select column (1 - 3) ");
    System.out.print("separated by a space: ");
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " X ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");
  
 
    //O's 2nd turn
    System.out.print("O - Select row (1-3) & select column (1-3) ");
    System.out.print("separated by a space: ");
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " O ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");  
 
    //X's 3rd turn
    System.out.print("X - Select row (1 - 3) & select column (1 - 3) ");
    System.out.print("separated by a space: ");
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " X ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");
        
    //O's 3rd turn
    System.out.print("O - Select row (1-3) & select column (1-3) ");
    System.out.print("separated by a space: ");
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " O ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");
    
    //X's 4th turn
    System.out.print("X - Select row (1 - 3) & select column (1 - 3) ");
    System.out.print("separated by a space: ");
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " X ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");
 
    //O's 4th turn
    System.out.print("O - Select row (1-3) & select column (1-3) ");
    System.out.print("separated by a space: ");
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " O ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");  
 
    //X's 5th turn
    System.out.print("X - Select row (1 - 3) & select column (1 - 3) ");
    System.out.print("separated by a space: ");
    row = input.nextInt();
    col = input.nextInt();
    if(board[row - 1][col - 1].equals(" - ")) {
      board[row - 1][col - 1] = " X ";
    }
    else {
      System.out.println("Sorry, that spot is taken.");
    }
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");
  }
}



import java.util.Scanner;

class WhileLoop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("This loop will run as long as the input is > 0");
    //Initialize loop variable so the loop will run (> 0)
    int entry = 1;
    while(entry > 0) {
      System.out.print("Enter a number (0 or less to quit): ");
      entry = input.nextInt();
    }
    System.out.println("=== End of loop ===\n");
  }
}



import java.util.Scanner;

class WhileEven {
  public static void main(String[] args) {
    System.out.println("This program keeps prompting the user to enter numbers ");
    System.out.println("as long as the entries are even. When the user enters an ");
    System.out.println("odd number \n");
    Scanner input = new Scanner(System.in);

    int number = 0;
    while(number % 2 == 0) {
      System.out.print("Enter a whole number: ");
      number = input.nextInt();
    }
    System.out.println("The loop is done");
  }
}



import java.util.Scanner;

class AppendWhile {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  String textToAdd = "";
  String text = "";

  //Can't use == to check for equality of Strings. Need to use the equals() or equalsIgnoreCase() to compare Strings.
    //Remember that ! means "not"
  while(!textToAdd.equalsIgnoreCase("quit")) {
    System.out.print("Enter a string (enter 'quit' to exit loop): ");
    textToAdd = input.nextLine();
    //Append input to text with space after it.
    text += textToAdd + " ";
  }
  System.out.println("\n" + text);
}
}



import java.util.Scanner;

class Break {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String textToAdd = "";
    String text = "";

    //Can't use == to check for equality of Strings. Need to use the equals() or equalsIgnoreCase() to compare Strings.
    //Remember that ! means "not". If the user enters a word longer than 4 letters, the loop ends.
    while(!textToAdd.equalsIgnoreCase("quit")) {
      System.out.println("Enter a string, enter quit or a word of more than (4)");
      System.out.println("letters to exit the loop: ");
      textToAdd = input.nextLine();
      if(textToAdd.length() > 4) {
        break;
      }
      //Append input to text with space after it.
      text += textToAdd + " ";
    }
    System.out.println("\n" + text);
  }
}



import java.util.Scanner;

class BreakCont {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String textToAdd = "";
    String text = "";

    //Can't use == to check for equality of Strings. Need to use the equals() or equalsIgnoreCase() to compare Strings.
    //Remember that ! means "not". If the user enters a word longer than 4 letters, the loop ends.
    while(!textToAdd.equalsIgnoreCase("quit")) {
      System.out.println("Enter a string, enter quit or a word of more than (4)");
      System.out.println("letters will be ignored: ");
      textToAdd = input.nextLine();
      if(textToAdd.length() > 4) {
        continue;
      }
      if(textToAdd.equalsIgnoreCase("quit")) {
        break;
      }
      //Append input to text with space after it.
      text += textToAdd + " ";
    }
    System.out.println("\n" + text);
  }
}



import java.util.Scanner;

class DoWhile {
  public static void main(String[] args) {
    System.out.println("This program keeps prompting the user to enter numbers ");
    System.out.println("as long as the entries are even. When the user enters an ");
    System.out.println("odd number.\n");
    Scanner input = new Scanner(System.in);
    //number not initialized since it will get a value in the body of the loop
    int number;
    do{
      System.out.print("Enter a whole number: ");
      number = input.nextInt();
    }
    while(number % 2 == 0);

    System.out.println("The loop is done");
  }
}



import java.util.Arrays;

class ForCountEven {
  public static void main(String[] args) {
    int[] numbers = {3, 41, 12, 9, 74, 15};
    //Counter initialized to 0
    int evenCount = 0;

    //Loop variable starts at 0, since first element index in array is 0. Remember the last index is 1 less than length of array.
    for(int index = 0; index < numbers.length; index++) {
      if(numbers[index] % 2 == 0) {
        evenCount++;
      }
    }
    //Display result
    System.out.print("The array " + Arrays.toString(numbers) + " ");
      System.out.println("contains " + evenCount + " even values");
  }
}



import java.util.Arrays;

class ForSum {
  public static void main(String[] args) {
    int[] numbers = {3, 41, 12, 9, 74, 15};
    //Sum initialized to 0
    int sum = 0;
    //Loop variable starts at 0, since the first element index in array is 0. Remember that last index is 1 less than length of array.
    for(int index = 0; index < numbers.length; index ++) {
      sum += numbers[index];
    }
    //Display result
    System.out.print("The sum of the values in the array ");
    System.out.print(Arrays.toString(numbers));
    System.out.println(" = " + sum);
  }
}



import java.util.Arrays;

class EnhancedForLoop {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    System.out.println("Values in array: " + Arrays.toString(numbers));
    for(int number : numbers) {
      //value can be used in statements in loop body
      System.out.println(number + " * 2 = " + number * 2);
    }
  }
}



import java.util.ArrayList;

class EnhancedForCollection {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Annette");
    names.add("John");
    names.add("Lee");
    System.out.println("ArrayList: " + names.toString());
    for(String name : names) {
      System.out.println(name + " has " + name.length() + " letters");
    }
  }
}



import java.util.HashSet;

class EnhancedForCollection {
  public static void main(String[] args) {
    HashSet<String> names = new HashSet<>();
    names.add("Annette");
    names.add("John");
    names.add("Lee");
    System.out.println("HashSet: " + names.toString());
    for(String name : names) {
      System.out.println(name + " has " + name.length() + " letters.");
    }
  }
}



import java.util.HashMap;

class EnhancedForHash {
  public static void main(String[] args) {
    //HashMap holds key-value pairs. The key (user ID) is a String (case sensitive). The value (score) is an Integer (int).
    HashMap<String, Integer> scores = new HashMap<>();
    scores.put("ssmith04", 88);
    scores.put("tlang01", 100);
    scores.put("glewis03", 99);
    System.out.println("HashMap: " + scores.toString());
    /*A HashMap isn't iterable, but the keySet() method returns a Set with the keys in the HashMap, which can be interated 
       over. The value can be retrieved using the key value */
    for(var key : scores.keySet()) {
      // For each key retrieve the value (score) & print 
      System.out.println(key + " has a score of " + scores.get(key));
    }
  }
}



class NestedLoops {
  public static void main(String[] args) {
    int [][] numbers = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    //Outer loop iterates over rows
    for(int row = 0; row < numbers.length; row ++ ) {
      //Inner loop iterates over columns in each row
      for(int col = 0; col < numbers[row].length; col++ ) {
        /*(row + 1) displays row # starting with 1 rather than 0. 
           (col + 1) displays column # starting with 1 rather than 0. 
           Parentheses needed so expression is evaluated before printing.
           These expressions do not change the values of row and col so 
           array access works as expected.*/
        System.out.println("Row: " + (row + 1) + " Col: " + (col + 1) + " = " + numbers[row][col]);
      }
    }
  }
}



class NestLoop {
  public static void main(String[] args) {
    int [][] numbers = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    //Without counters in loops, need rowNumber, colNumber
    int rowNumber = 1;
    int colNumber = 1;
    //Outer loop iterates over rows. Each row is a single-dimensional array
    for(int[] row : numbers) {
      //Inner loop iterates over columns in each row
      for(int value : row) {
        //Note space between colNumber++ and following + .Remember that ++ is increment operator, + is concatenation operator
        System.out.println("Row: " + rowNumber + " Col: " + colNumber++ + " = " + value);
      }
      colNumber = 1; //Reset colNumber after down with columns in row
      rowNumber++; //increment rowNumber after done with row
    }
  }
}



import java.util.Scanner;

class LoopUntilDone {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while(true) {
      System.out.print("Enter input or type done to end: ");
      String line = input.nextLine();
      //Check if line is "done" (ignoring case)
      if(line.equalsIgnoreCase("done")) {
        break; //end loop when done has been entered
      }
      else {
        //Print out entry is not equal to "done"
        System.out.println(line);
      }
    }
    System.out.println("Done");
  }
}



import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeLoop {

  public static void main(String[] args) {
    String[][] board = {{" - ", " - ", " - "},
                        {" - ", " - ", " - "},
                        {" - ", " - ", " - "}};

    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");

    Scanner input = new Scanner(System.in);
    int col = 0;
    int row = 0;
    //Variable to keep track of current player
    char player;

    //for loop to provide total of 9 turns
    for(int turn = 0; turn < 9; turn++) {
      //If an even turn number, player is X:
      if(turn % 2 == 0) {
        player = 'X';
      }
      //odd turns are O's turns:
      else {
        player = 'O';
      }

      //Check if col or row is less than 1 or greater than 3:
      while(col < 1 || col > 3 || row < 1 || row > 3){
        System.out.print(player + " - Select row (1 - 3) & select column (1 - 3) ");
        System.out.print("separated by a space: ");
      row = input.nextInt();
      col = input.nextInt();
      }
      if(board[row - 1][col - 1].equals(" - ")) {
        //Use player to provide either X or O
        board[row - 1][col - 1] = " " + player + " ";
      }
      else {
        System.out.println("Sorry, that spot is taken");
      }

      //Reset col and row back to 0 for next turn
      col = 0;
      row = 0;
      System.out.println("\t" + Arrays.toString(board[0]));
      System.out.println("\t" + Arrays.toString(board[1]));
      System.out.println("\t" + Arrays.toString(board[2]) + "\n");
    }
  }
}



class SayHello {
  static String sayHello(String name) {
    return "Hello, " + name;
  }

  public static void main(String[] args) {
    String userName = "Blue";
    //Pass variable userName as parameter to sayHello()
    String greeting = sayHello(userName);
    //Pass variable greeting as parameter to println()
    System.out.println(greeting);
  }
}



class SayHelloRepeat {
  static String sayHello(String name, int count) {
    //local variable to assemble greeting
    String greeting = "";
    for(int i = 0; i < count; i++) {
      greeting += "Hello, " + name + "\n";
    }
    return greeting;
  }

  public static void main(String[] args) {
    String userName = "Blue";
    //Pass variable userName as parameter to sayHello()
    String greetingOutput = sayHello(userName, 3);
    //Pass variable greeting as parameter to println()
    System.out.println(greetingOutput);
  }
}



import java.util.ArrayList;

public class SayHelloCollection {
  //Pass ArrayList of names to method. Remember that collections are generic. T is placeholder for the data type
  static <T> String sayHello(ArrayList<T> names) {
    //Local variable to assemble greeting
    String greeting = "";
    //T is the data type
    for(T name : names) {
      greeting += "Hello, " + name + "\n";
    }
    return greeting;
  }

  public static void main(String[] args) {
    ArrayList<String> userNames = new ArrayList<>();
    userNames.add("Blue");
    userNames.add("Bleue");
    userNames.add("Blew");
    //Pass variable userNames as parameter to sayHello()
    String greetingOutput = sayHello(userNames);
    //Pass variable greetingOutput to as parameter println()
    System.out.println(greetingOutput);
  }
}



import java.util.Arrays;

class MethodChangeArray {
  //This method does not return anything but still changes the order of items in the array passed to it. 
  public static void sortArray(int[] values) {
    Arrays.sort(values);
  }

  public static void main(String[] args) {
    int[] numbers = {5, 4, 3, 2, 1};
    //Display array contents before method call
    System.out.println("Original array: ");
    System.out.println(Arrays.toString(numbers));
    //Call method
    sortArray(numbers);
    System.out.println("Array after method call: ");
    //Display array contents after method call
    System.out.println(Arrays.toString(numbers));
  }
}



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MethodChangeCollection {
  //This method does not retun anything but still changes the order of items in the ArrayList passed to it. 
  public static void sortArrayList(ArrayList<Integer> values) {
    Collections.sort(values);
  }

  public static void main(String[] args) {
    //ArrayList collection of Integer values 
    ArrayList<Integer> numbers = new ArrayList <>();
    numbers.add(5);
    numbers.add(4);
    numbers.add(3);
    numbers.add(2);
    numbers.add(1);
    //Display array contents before method call
    System.out.println("Original ArrayList: ");
    System.out.println(numbers.toString());
    //Call method
    sortArrayList(numbers);
    System.out.println("ArrayList after method call: ");
    //Display array contents after method call
    System.out.println(numbers.toString());
  }
}



class VarAverage {
  //The ... indicates that the method can take a variable number of values as its parameter (in this case, doubles)
  public static double getAverage(double... values) {
    double sum = 0;
    int count = 0;
    //Use an enhanced for loop to iterate through values
    for(double number : values) {
      sum += number;
      count++;
    }
    return sum / count;
  }

  public static void main(String[] args) {
    double avg1 = getAverage(1.2, 3.3);
    System.out.println("avg1 = " + avg1);
    double avg2 = getAverage(1.2, 3.3, 4.5, 5.1);
    System.out.println("avg2 = " + avg2);
  }
}



class SaySayHello {
  public static void main(String[] args) {
    //The variable to the left of the equal sign holds the value returned from the method (a String)
    String greeting = sayHello("Blue");
    System.out.println(greeting);
    //In this call, the String returned from the method is passed directly to println() for display
    System.out.println(sayHello("Blue"));
    //Since the following does not save the returned String to a String variable and since the call is not embedded in another method call, the String is lost
    sayHello("Blue");
  }

  static String sayHello(String name) {
    return "Hello, " + name;
  }
}



import java.util.Random;
import java.util.Arrays;

class RandomMethod {
  //Method returns an array of random integers parameters are maximum of the range (minimum is 1) count is number of random numbers to return
  static int[] getRandomIntegers(int max, int count) {
    //Create random number generator - see the guessing game
    Random randomGenerator = new Random();
    int[] randomNumbers = new int[count];
    for(int i = 0; i < count; i++) {
      //Get a random number in the range from 1 to max
      randomNumbers[i] = randomGenerator.nextInt(max) + 1;
    }
    //Return array to caller
    return randomNumbers;
  }

  public static void main(String[] args) {
    //Get an array of 3 integers in the range from 1 to 100
    int[] results = getRandomIntegers(100, 3);
    System.out.println("Results: " + Arrays.toString(results));
  }
}



import java.util.Random;
import java.util.ArrayList;

class RandomCollectionMethod {
  static ArrayList<Integer> getRandomIntegers(int max, int count) {
    //Create random number generator - see the guessing game
    Random randomGenerator = new Random();
    ArrayList<Integer> randomNumbers = new ArrayList<>();
    for(int i = 0;  i < count; i++) {
      //Get a random number in the range from 1 to max
      randomNumbers.add(randomGenerator.nextInt(max) + 1);
    }
    //Return array to caller
    return randomNumbers;
  }

  public static void main(String[] args) {
    //Get an array of 3 integers in the range from 1 to 100
    ArrayList<Integer> results = getRandomIntegers(100, 3);
    System.out.println("Results: " + results.toString());
  }
}



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
      System.out.println("Checking col " + col + "=");
      System.out.println(board[col][0] + "\n" + board[col][1] + "\n" + board[col][2]);
      if(board[0][col].equals(" " + player + " ") &&
        board[1][col].equals(" " + player + " ") &&
        board[2][col].equals(" " + player + " ")) {
        //Add 1 to col number to match human count (starting with 1)
        colNumber = col + 1;
        //Temporary statement to print out winning row:
        //System.out.println(Arrays.toString(board[row]));
        System.out.println("Col:\n"+ board[0][col] + "\n" + board[1][col] + "\n" + board[2][col]);
        break;
        }
    }
    //If colNumber > 0, there is a winning row
    System.out.println("colNumber:" + colNumber);
    return colNumber;
  }
}



import java.util.Arrays;
import java.util.Scanner;

public class TicTicToo { //TicTacToeMethods
  public static void main(String[] args) {
    String[][] board = {{" - ", " - ", " - "},
                        {" - ", " - ", " - "},
                        {" - ", " - ", " - "}};
    //Array of player marks
    char[] player = {'X', 'O'};
    
    int col = 0;
    int row = 0;
    //Initialized so input while loop runs until entry is valid
    boolean validSelection = false;
    
    Scanner input = new Scanner(System.in);
    
    //Draw initial empty board
    drawGame(board);
    
    //Start turns. Even turns are X, odd turns are O
    for(int turn = 0; turn < 9; turn++) {
      //Prompt for input until the user makes a valid move
      while(!validSelection) {
        System.out.print(player[turn % 2] + " - Select row (1 - 3) & column (1 - 3) separated by a space: " );
        row = input.nextInt();
        col = input.nextInt();
        if(isValidSelection(row, col)) {
          if(isPositionOpen(board, row, col)) {
            //Set player character at position
            board[row - 1][col - 1] = " " + player[turn % 2] + " ";
            //while loop will end when selected move is valid
            validSelection = true;
          }
          else { //Position is not open
            System.out.println("Sorry, that spot is taken");
          }
        }
          //Not a valid position
        else {
          System.out.println("Sorry, that is not a valid selection");
        }
      }
      
      drawGame(board);
      //Check if this is 5th or later turn (turn starts at 0)
      if(turn >= 4) {
        int winningRow = checkForRowWin(board, player[turn % 2]);
        int winningColumn = checkForColumnWin(board, player[turn % 2]);
        int winningDiagonal = checkForDiagonalWin(board, player[turn % 2]);
        if(winningRow > 0 || winningColumn > 0 || winningDiagonal > 0) {
          System.out.println("\n" + player[turn % 2] + " wins!\n");
          break;
        }
      }
      //Set Set so that while loop repeats until next player makes valid move
      validSelection = false;
    } //end of for loop for turns
  } //end of main
  
  
  //Method to draw board. Parameter is a 2D array with board data
  public static void drawGame(String[][] board) {
    for(int row = 0; row < board.length; row++) {
      System.out.println(Arrays.toString(board[row]));
    }
    System.out.println(); //Add blank line after drawing board
  }
  
  
  //Method to check if player has selected row & column within bounds
  //Takes 2 int parameters for selected row & column. Returns true if selection is in bounds, false if not
  public static boolean isValidSelection(int row, int column) {
    //! needed to return true if selection is valid position
    return !(row < 1 || row > 3 || column < 1 || column > 3);
    //return (row >= 1 && row <= 3 && column >= 1 && column <= 3);
  }
  
  
  //Method to check if selected position is open.
  //Parameters: 2-d array with board data, ints for row & column
  //Returns true is selected position is open, otherwise false
  public static boolean isPositionOpen(String[][] board, int row, int column) {
    //Open positions marked with " - "
    return board[row - 1][column - 1].equals(" - ");
  }
  
  
  //Check if a player has a win in 1 of the rows.
  //Parameters: 2-d array with board data, char ('X' or 'O') for player
  //Returns 0 if no winning row, or 1, 2, or 3 if winning row
  public static int checkForRowWin(String[][] board, char player) {
    //variable to track row that holds a win:
    int rowNumber = 0;
    for(int row = 0; row < 3; row++) {
      if(board[row][0].equals(" " + player + " ") &&
         board[row][1].equals(" "+ player + " ") &&
         board[row][2].equals(" " + player + " ")) {
        //add 1 to row # to match human count(start at 1)
        rowNumber = row + 1;
        break;
      }
    } //if rowNumber > 0, there is a winning row
    return rowNumber;
  }
  
  
  //Check if a player has a win in 1 of the columns.
  //Parameters: 2-d array with board data, char ('X' or 'O') for player
  //Returns 0 if no winning col, or 1, 2, or 3 if winning col
  public static int checkForColumnWin(String[][] board, char player) {
    //variable to track row that holds a win:
    int colNumber = 0;
    for(int col = 0; col < 3; col++) {
      if(board[0][col].equals(" " + player + " ") &&
         board[1][col].equals(" "+ player + " ") &&
         board[2][col].equals(" " + player + " ")) {
        //add 1 to row # to match human count(start at 1)
        colNumber = col + 1;
        break;
      }
    } //if rowNumber > 0, there is a winning row
    return colNumber;
  }
  
  
  //Check if a player has a win in 1 of the diagonals.
  //Parameters: 2-d array with board data, char ('X' or 'O') for player
  //Returns 0 if no winning diagonal, or 1 or 2 if winning diagonal
  public static int checkForDiagonalWin(String[][] board, char player) {
    int diagonalNumber = 0;
    //player must have central position to win
    if(board[1][1].equals(" " + player + " ")) {
      if(board[0][0].equals(" " + player + " ") &&
         board[2][2].equals(" " + player + " ")) {
        diagonalNumber = 1;
      }
      else if(board[0][2].equals(" " + player + " ") &&
              board[2][0].equals(" " + player + " ")) {
        diagonalNumber = 2;
      }
    }
    return diagonalNumber;
  }
}