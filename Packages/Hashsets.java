import java.util.HashSet;

public class HashSets {
  public static void main(String[] args) {

    HashSet<Integer> numbers = new HashSet<Integer>();
    

    numbers.add(4);
    System.out.println("Added 4 to numbers");
    numbers.add(7);
    System.out.println("Added 7 to numbers");
    numbers.add(8);
    System.out.println("Added 8 to numbers");
    
    System.out.println("HashSet: "+numbers);
        
    System.out.println("4:"+ numbers.contains(4));
    
	System.out.println("Size: "+numbers.size());
    
    System.out.println("Removed :"+numbers.remove(4));
 	System.out.println("HashSet: "+numbers);
    System.out.println("Cleared numbers.");
    //System.out.println("HashSet: "+numbers);
  }
}
