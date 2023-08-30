import java.util.Arrays;

class PetArray {
  public static void main(String[] args) {
    String[] petlist = {"dog", "kitten", "snake"};
    petlist[1] = "kitten";
    System.out.println(Arrays.toString(petlist));
  }
}