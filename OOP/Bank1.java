public class Bank1{
  private Account accountOne;
  private Account accountTwo;

  public Bank1(){
    accountOne = new Account("Zeus", 100, "1");
    accountTwo = new Account("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank1 bankOfGods = new Bank1();
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
  }

}
