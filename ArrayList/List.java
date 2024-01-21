import java.util.ArrayList;

class List {
  
  public static void main(String[] args) {
    ArrayList<String> data = new ArrayList<String>();
    data.add("Mark");
    data.add("Jess");
    data.add(1, "Becky");
    System.out.println("Size of entered data: "+ data.size());
    System.out.println("Data: "+ data);
    System.out.println("Data at index 2: "+ data.get(2));
    data.set(0,"Taylor");
    System.out.println("Data: "+data);
    System.out.println("Index of Taylor: "+data.indexOf("Taylor"));
    System.out.println("Removed Taylor");
    data.remove("Taylor");
    System.out.println("Data: "+data);
    System.out.println("-------------");
    ArrayList<Integer> data1 = new ArrayList<Integer>();
    data1.add(24);
    data1.add(62);
    data1.add(1,45);
    System.out.println("Size of entered data: "+ data1.size());
    System.out.println("Data: "+ data1);
    System.out.println("Data at index 2: "+ data1.get(2));
    data1.set(0,Integer.valueOf(48));
    System.out.println("Data: "+data1);
    System.out.println("Index of Taylor: "+data1.indexOf(Integer.valueOf(48)));
    System.out.println("Removed Taylor");
    data1.remove(Integer.valueOf(48));
    System.out.println("Data: "+data1);
  }
  
}
