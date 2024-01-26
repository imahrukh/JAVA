import java.time.*; 
import java.time.format.DateTimeFormatter;

public class DateTime {  
  public static void main(String[] args) {  
  	System.out.println("Displaying current date: ");
    LocalDate myObj = LocalDate.now();  
    System.out.println(myObj); 
    System.out.println("Displaying current time: ");
    LocalTime myTime = LocalTime.now();
    System.out.println(myTime);
    System.out.println("Displaying current date Time:");
    LocalDateTime myDateTime = LocalDateTime.now();
    System.out.println(myDateTime);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }  
}  
