public class ATM{

  public static int totalMoney = 0;
  public static int numATMs = 0;

  public int money;

  public ATM(int inputMoney){
    this.money = inputMoney;
    totalMoney+=inputMoney;
    numATMs ++;
  }

  public void withdrawMoney(int amountToWithdraw){
    if(amountToWithdraw <= this.money){
      this.money -= amountToWithdraw;
      totalMoney-= amountToWithdraw;
    }
  }

  public static void main(String[] args){

    System.out.println("Total number of ATMs: " + ATM.numATMs); 
    ATM firstATM = new ATM(1000);
    System.out.println("Money in first ATM:  "+ firstATM.money);
    ATM secondATM = new ATM(500);
    System.out.println("Money in second ATM:  "+ secondATM.money);
    System.out.println("Total number of ATMs: " + ATM.numATMs); 

    System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);  

    firstATM.withdrawMoney(500);
    System.out.println("Money in first ATM:  "+ firstATM.money);
    System.out.println("Money in second ATM:  "+ secondATM.money);
    System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney); 
    secondATM.withdrawMoney(200);

    System.out.println("Money in first ATM:  "+ firstATM.money);
    System.out.println("Money in second ATM:  "+ secondATM.money);
    System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);    

  }

}
