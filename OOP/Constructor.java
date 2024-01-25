
public class Constructor {
  int modelYear;
  String modelName;

  public Constructor(){ //default constructor
  	System.out.println("default constructor called.");
  	modelYear =0;
  	modelName =" ";
  }
  
  public Constructor(int year, String name) { //parameterized constructor
  	System.out.println("Parameterized constructor");
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
  	Constructor myCars = new Constructor();
    System.out.println(myCars.modelYear+" "+myCars.modelName);
    Constructor myCar = new Constructor(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}
