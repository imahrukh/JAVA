public class Reservation4 {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    if (count < 1 || count > 8) {
      System.out.println("Invalid reservation!");
    }
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
			isConfirmed = false;
    }
  }
  
  public void informUser() {
    if (!isConfirmed) {
      System.out.println("Unable to confirm reservation, please contact restaurant.");
    } else {
      System.out.println("Please enjoy your meal!");
    }
  }
  
  public static void main(String[] args) {
    Reservation table1 = new Reservation (4,6,true);
    table1.confirmReservation();
    table1.informUser();
    Reservation table2 = new Reservation( 4, 1, false);
    table2.confirmReservation();
    table2.informUser();
    Reservation table3 = new Reservation(7,6, true);
    table2.confirmReservation();
    table2.informUser();
  }
}
