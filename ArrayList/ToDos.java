import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "Water plants";
    String toDo2 = "Aquamarine plants";
    String toDo3 = "Terrestrial plants";
    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);
    System.out.println(toDoList);
    toDoList.add(1,toDo1);
    toDoList.add(3,toDo2);
    toDoList.add(2,toDo3);
    System.out.println(toDoList);
  }
  
}
