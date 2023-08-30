import java.util.Arrays;

class NumbersArraySort {
  public static void main(String[] args) {
    int[] numArray = {2, 45, 9, 17, 1, 2};
    System.out.println("Original Array: " + Arrays.toString(numArray));
    Arrays.sort(numArray);
    System.out.println("Sorted Array: " + Arrays.toString(numArray));
  }
}