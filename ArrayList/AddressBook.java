import javax.swing.*;
import java.util.*;
public class AddressBook{
    ArrayList<Person> persons;
    
    public AddressBook(){
        persons = new ArrayList<Person>();
    }
    
    public void addPerson(){
        String name = JOptionPane.showInputDialog("Enter name: "); 
        String address = JOptionPane.showInputDialog("Enter address: "); 
        String contactNo = JOptionPane.showInputDialog("Enter phone no: "); 
        Person p = new Person(name, address, contactNo);
        persons.add(p);
    }
    
    public void removePerson(){
        String name = JOptionPane.showInputDialog("Enter name to delete sontact: "); 
        for (int i=0; i< persons.size(); i++) { 
          Person p = (Person)persons.get(i); 
            if ( name.equals(p.getName()) ) { 
                persons.remove(i);
                break;
            }
        }
    }
    
    public void searchPerson(){
        String name = JOptionPane.showInputDialog("Enter name to search contact: "); 
        for (int i=0; i< persons.size(); i++) { 
          Person p = (Person)persons.get(i); 
            if ( name.equals(p.getName()) ) { 
                p.display();
                break;
            }
        }
    }
}
