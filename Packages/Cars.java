import java.util.LinkedList;

public class Cars {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    System.out.println("LinkedList: "+cars);
    cars.add("BMW");
    System.out.println("LinkedList: "+cars);
    cars.add("Ford");
    System.out.println("LinkedList: "+cars);
    cars.addFirst("Mazda");
    System.out.println("LinkedList: "+cars);
    cars.addLast("Porsche");
    System.out.println("Linked List: "+cars);
    System.out.println("first: "+cars.getFirst());
    cars.removeFirst();
    System.out.println("LinkedList: "+cars);
    System.out.println("last: "+ cars.getLast());
    cars.removeLast();
    System.out.println("LinkedList: "+cars);
    
  }
}
