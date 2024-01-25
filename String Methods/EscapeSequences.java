public class EscapeSequences {
  public static void main(String[] args) {
    String txt = "Hello\nWorld!";
    String txt1= "Hello\rWorld!";
    String txt2= "Hello\tWorld!";
    String txt3= "Hello\bWorld!";
    String txt4= "Hello\fWorld!";
    System.out.println("new line: "+txt);
    System.out.println("carriage operator: "+txt1);
    System.out.println("tab operator: "+txt2);
    System.out.println("back Space:"+ txt3);
    System.out.println("form feed: "+txt4);
    
    
  }
}
