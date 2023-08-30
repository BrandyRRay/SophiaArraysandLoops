public class SayHelloArray {
  //Pass array of names to method
  static String sayHello(String[] names) {
    //local variable to assemble greeting
    String greeting = "";
    for(String name : names) {
      greeting += "Hello, " + name + "\n";
    }
    return greeting;
  }

  public static void main(String[] args) {
    String[] userNames = {"Blue", "Bleue", "Blew"};
    //Pass variable userName as parameter to sayHello()
    String greetingOutput = sayHello(userNames);
    //Pass variable greeting as parameter to println()
    System.out.println(greetingOutput);
  }
}