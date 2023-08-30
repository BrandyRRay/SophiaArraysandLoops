class OverloadMethod {
  public static void main(String[] args) {
    System.out.println("Method call with string: ");
    String result = sayHello("Blue");
    System.out.println(result + "\n");

    System.out.println("Method call with string and int: ");
    result = sayHello("Bleue", 2);
    System.out.println(result + "\n");

    System.out.println("Method call with array of strings: ");
    String[] firstNames = {"Bloo", "John", "Mary", "Kim"};
    result = sayHello(firstNames);
    System.out.println(result);
  }

  //method with 1 string parameter
  static String sayHello(String name) {
    return "Hello, " + name;
  }

  //method with 2 parameters: string & int  
  static String sayHello(String name, int count) {
    //Local variable to assemble greeting
    String greeting = "";
    for(int i = 0; i < count; i++) {
      greeting += "Hello, " + name + "\n";
    }
    return greeting;
  }

  //method with 1 array of strings parameter
  static String sayHello(String[] names) {
    String greeting = "";
    for(String name : names) {
      greeting += "Hello, " + name + "\n";
    }
    return greeting;
  }  
}