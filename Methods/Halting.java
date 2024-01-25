public class Halting {
  public static void main(String[] args) {
    int result = sum(5, 10);
    System.out.println(result);
  }
  public static int sum(int start, int end) {
    if (end > start) {
    	System.out.println(start+","+end);
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
}
