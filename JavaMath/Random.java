public class Main {
  public static void main(String[] args) {
  	System.out.println("Generate random number");
    System.out.println(Math.random());  
    System.out.println("Generating random no from 0 to 100");
    int randomNum = (int)(Math.random() * 101);  // 0 to 100
    System.out.println(randomNum);
  }
}
