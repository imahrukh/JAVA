class NoodleRestaurant {
  String name;

  public NoodleRestaurant(String customerName){
    name = customerName;
  }

  public void order(Noodles noodle) {
    System.out.println(noodle.getCookPrep());
    System.out.println("Order for " + name + " is ready.");
  }

  public static void main(String[] args) {
    Noodles ramen, pho;
    ramen = new Ramen();
    pho = new Pho();
    
    NoodleRestaurant customer1 = new NoodleRestaurant("Sweeden");
    NoodleRestaurant customer2 = new NoodleRestaurant("Kotlar");

    customer1.order(pho);
    customer2.order(ramen);

  }
}
