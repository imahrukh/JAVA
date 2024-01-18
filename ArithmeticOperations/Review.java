public class BankAccount {
  	public static void main(String[] args){
      double balance = 1000.75;
      double amountToWithdraw = 250;
      double updatedBalance= balance-amountToWithdraw;
      double amountForEachFriend= updatedBalance/3;
      boolean canPurchaseTicket=amountForEachFriend>=250;
      System.out.println("Initial Balance: "+balance);
      System.out.println("Withdraw Amount: "+amountToWithdraw);
      System.out.println("UpdatedBalance: "+updatedBalance);
      System.out.println("Concert Ticket Amount: "+250);
      System.out.println("I gave each friend "+amountForEachFriend);
      System.out.println("Can friend buy ticket: "+canPurchaseTicket);
    }       
}
