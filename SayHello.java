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