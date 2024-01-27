//import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
	public static void check(boolean flag, String name){
    	if(flag){
    		System.out.println(name+" found!");
    	}
    	else{
    	System.out.println(name+" not found!");
    	}
    }
   /* public static String getInput(){
    	Scanner myObj = new Scanner(System.in);
       	String name = null;
        while (name == null) {
        System.out.println("Enter the string to find: ");
        name = myObj.nextLine();
        /*try {
            name = myObj.nextLine();
        } catch (NoSuchElementException e) {
            System.out.println("Invalid input. Please enter a string.");
        }
    }
        myObj.close();
        return name;
    }*/
	public static void main(String[] args){
    	String name ="FAST-National University of Computer & Emerging and Sciences";
        String subname ="National";
    	Pattern pattern = Pattern.compile(subname); //compile the pattern which is to be searched
    	Matcher matcher= pattern.matcher(name); //search for pattern in a string
    	boolean flag= matcher.find(); //returns true if pattern was matched
    	check(flag, subname );
        
        subname = "fast";
        pattern = Pattern.compile(subname, Pattern.CASE_INSENSITIVE);
        matcher= pattern.matcher(name);
        flag= matcher.find();
        System.out.println("Case insensitive!");
        check(flag, subname);
    
        subname = "sT-N";
        pattern = Pattern.compile(subname, Pattern.LITERAL);
        matcher= pattern.matcher(name);
        flag= matcher.find();
        System.out.println("Literal-treating special car as ordinary");
        check(flag, subname);
        
        subname = "ST_N";
        pattern = Pattern.compile(subname, Pattern.UNICODE_CASE);
        matcher= pattern.matcher(name);
        flag= matcher.find();
        System.out.println("Uni-code applied");
        check(flag, subname);
    }
}

 
