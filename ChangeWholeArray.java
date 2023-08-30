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