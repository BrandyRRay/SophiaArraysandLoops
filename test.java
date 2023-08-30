//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;

class test {
  public static void main(String[] args) {
    System.out.println(saySomething("Jen"));
    static String saySomething(String name) {
      String output = "";
    if (name.length() < 5) {
      output = name + ", your name is short.";
    }
    else {
      output = name + ", your name is long.";
    }
    return output;
  }
}