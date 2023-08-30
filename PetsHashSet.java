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