public class Review {
  
  public static void main(String[] args) {
    String str ="SayHelloBeforeGoing123";
    System.out.println("String: "+str);
    System.out.println("Length: "+str.length());
    System.out.println("String concatination: "+str.concat("Goodbye"));
    System.out.println("Index of e: "+str.indexOf('e'));
    System.out.println("Char at 3: "+str.charAt(3));
    System.out.println("equals(): " +str.equals("Sayheloo.."));
    System.out.println("Substring: "+str.substring(5));
    System.out.println("toUpperCase: "+str.toUpperCase());
  }
  
}
