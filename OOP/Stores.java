public class Stores {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Stores(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }
  public String toString(){
    return "This store sells "+productType+" at a price of "+ price+".";
  }
  // main method
  public static void main(String[] args) {
    Stores lemonadeStand = new Stores("Lemonade", 3.75);
    Stores cookieShop = new Stores("Cookies", 5);
    System.out.println(lemonadeStand);
    // without toString() gives position in memory along with name of object
    System.out.println(cookieShop);
  }
}
