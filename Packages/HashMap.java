import java.util.HashMap;

public class HashMap {
  public static void main(String[] args) {
    HashMap<String, String> capital = new HashMap<String, String>();
    capital.put("England", "London");
    capital.put("Germany", "Berlin");
    capital.put("Norway", "Oslo");
    capital.put("USA", "Washington DC");
    System.out.println("Hash Map:"+capital); 
    System.out.println("England: "+capital.get("England"));
    System.out.println("Removed: "+capital.remove("England"));
    System.out.println("Hash Map:"+capital); 
    System.out.println("HashMap size:"+capital.size());
    System.out.println("Looping through keys: ");
    for (String i : capital.keySet()) {
  		System.out.println(i);
	}
     System.out.println("Looping through values: ");
	for (String i : capital.values()) {
  		System.out.println(i);
	}
    for (String i : capital.keySet()) {
  		System.out.println("key: " + i + " value: " + capital.get(i));
	}
    System.out.println("clearing capital");
    capital.clear();
    //System.out.prntln(capital);
    
  }
}
