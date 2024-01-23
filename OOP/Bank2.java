public class Bank2{
  private CheckingAccount2 accountOne;
  private CheckingAccount2 accountTwo;

  public Bank2(){
    this.accountOne = new CheckingAccount("Zeus", 100, "1");
    this.accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank2 bankOfGods = new Bank2();
    bankOfGods.accountOne.getAccountInformation();
   // bankOfGods.accountOne.calculateNextMonthInterest();
  }

}
