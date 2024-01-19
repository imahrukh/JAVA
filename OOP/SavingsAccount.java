public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  public void checkBalance(){
    System.out.println("Hello!\nYour balance is "+ balance);
  }
  
  public void deposit(int amountToDeposit){
    balance+=amountToDeposit;
    System.out.println("You just deposited "+ amountToDeposit);
  }

  public int withdraw(int amountToWithdraw){
    balance-=amountToWithdraw;
    System.out.println("You just withdrew "+ amountToWithdraw);
    return amountToWithdraw;
  }

  public String toString(){
    return "The account's balance is: "+ balance;
  }
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    savings.checkBalance();
    
    //Withdrawing:
    savings.withdraw(300);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
   savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    //calling to String
    System.out.println(savings);
  }       
}
