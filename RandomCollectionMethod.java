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