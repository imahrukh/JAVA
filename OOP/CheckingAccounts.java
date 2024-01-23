public class CheckingAccounts{
  private String name;
  private int balance;

  public CheckingAccounts(String inputName, int inputBalance){
    name = inputName;
    balance = inputBalance;
  }

  private void addFunds(int fundsToAdd){
    balance += fundsToAdd;
  }

  private void getInfo(){
    System.out.println("This checking account belongs to " + name +". It has " + balance + " dollars in it.");
  }

  public static void main(String[] args){
    CheckingAccounts myAccount = new CheckingAccounts("Mah Rukh", 259060);
    System.out.println("Account Balance :"+myAccount.balance);
    myAccount.addFunds(5);
    System.out.println("Added Funds: 5");
    System.out.println("Account Balance: "+myAccount.balance);
  }
AC
}
