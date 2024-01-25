public class Overloading {
  static int plusMethod(int x, int y) {
  	System.out.println("Integer type called: ");
    return x + y;
  }
  
  static double plusMethod(double x, double y) {
  	System.out.println("Double type called: ");
    return x + y;
  }
  
  public static void main(String[] args) {
    int myNum1 = plusMethod(8, 5);
    double myNum2 = plusMethod(4.3, 6.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
  }
}
