class Outer {
	public Outer(){
    	System.out.println("Outer called.");}
  	int x = 10; 

  class Inner {
 	 public Inner(){
  		System.out.println("Inner called.");}
    public int myInnerMethod() {
      return x;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Outer myOuter = new Outer();
    Outer.Inner myInner = myOuter.new Inner();
    System.out.println(myInner.myInnerMethod());
  }
}
