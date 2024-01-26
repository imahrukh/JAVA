public class Main {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar);
  }
}
//An enum is just like a class, but enum constants are public, static and final (unchangeable - cannot be overridden).
// enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
