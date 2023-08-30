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