public class Password {
  
  public static void main(String[] args) {
    
    String password = "correcthorsebatterystaple";
    System.out.println(".equals()");
    System.out.println(password.equals("Tr0ub4dor&3"));
    if(password.equals("CorrectTHORsBatterYStaplE")){
      System.out.println("Passwords are same.");
    }
    else{
      System.out.println("Passwords are not same.");
    }
    System.out.println(".equalsIgnoreCase()");
    if(password.equalsIgnoreCase("CorrecTHORseBatterYStaplE")){
      System.out.println("Passwords are same.");
    }
    else{
      System.out.println("Passwords are not same.");
      }
    System.out.println("Comparing the strings");
    if(password.compareTo("CorrectTHORsBatterYStaplE")>0){
      System.out.println("Passwords are same");
    }
    else{
      System.out.println("Passwords are not same.");
    }
  }
}
