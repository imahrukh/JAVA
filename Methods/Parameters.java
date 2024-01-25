public class Parameters.java {
  static void myMethod(String fname, int age) {//fname, age -> arguments
    System.out.println(fname + " is " + age); 
  }

  public static void main(String[] args) {
    myMethod("Liam", 5); //Liam, 5 -> arguments
    myMethod("Jenny", 8);
    myMethod("Anja", 31);
  }
}
