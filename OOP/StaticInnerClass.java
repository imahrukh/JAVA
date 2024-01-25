class Outer {
	public Outer(){
    	System.out.print("Outer called.\n");}
  int x = 10;

  static class Inner {
  public Inner(){
    	System.out.print("Inner called.\n");}
    int y = 5;
  }
}

public class StaticInnerClass {
  public static void main(String[] args) {
    Outer.Inner myInner = new Outer.Inner();
    System.out.println(myInner.y);
  }
}
