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