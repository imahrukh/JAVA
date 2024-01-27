//import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns{
	public static void check(boolean flag, String name){
    	if(flag){
    		System.out.println(name+" found!");
    	}
    	else{
    	System.out.println(name+" not found!");
    	}
    }
    
	public static void main(String[] args){
    	String name ="FAST-National University of Computer & Emerging and Sciences";
        String subname ="abcdef";
    	Pattern pattern = Pattern.compile(subname); //compile the pattern which is to be searched
    	Matcher matcher= pattern.matcher(name); //search for pattern in a string
    	boolean flag= matcher.find(); //returns true if pattern was matched
        System.out.println("[abcdef] searched-> true if any found");
    	check(flag, subname );
        
        subname = "abcdefzyx";
        pattern = Pattern.compile(^subname);
        matcher= pattern.matcher(name);
        flag= matcher.find();
        System.out.println("[^abcdefzyx] searched->true if any outside brackets found.");
        check(flag, subname);        
        
        pattern = Pattern.compile(0-9);
        matcher= pattern.matcher(name);
        flag= matcher.find();
        System.out.println("[0-9] searched->true if any value found in between range");
        check(flag, "0-9");
    }
}

 
