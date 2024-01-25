class Outer {
	public Outer(){
    	System.out.println("Outer called.\n");}
 	int x = 10;

  	class Inner {
  		public Inner(){
        	System.out.println("Inner called.\n");}
    	int y = 5;
  }
}

public class InnerClass {
  public static void main(String[] args) {
    Outer myOuter = new Outer();
    Outer.Inner myInner = myOuter.new Inner();
    System.out.println(myInner.y + myOuter.x);
  }
}
