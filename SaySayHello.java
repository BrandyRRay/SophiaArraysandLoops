class SaySayHello {
  public static void main(String[] args) {
    //The variable to the left of the equal sign holds the value returned from the method (a String)
    String greeting = sayHello("Blue");
    System.out.println(greeting);
    //In this call, the String returned from the method is passed directly to println() for display
    System.out.println(sayHello("Blue"));
    //Since the following does not save the returned String to a String variable and since the call is not embedded in another method call, the String is lost
    sayHello("Blue");
  }

  static String sayHello(String name) {
    return "Hello, " + name;
  }
}