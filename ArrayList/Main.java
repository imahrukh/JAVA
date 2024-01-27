import javax.swing.*;
public class Main{
    public static void main(String[] args){
        AddressBook addressBook = new AddressBook();
        String input =" ";
        int ch  =0;
        
        while(true){
            input = JOptionPane.showInputDialog("Enter 1 to add " + "\n Enter 2 to Search"+ "\n Enter 3 to Delete" + "\n Enter 4 to Exit");
            ch = Integer.parseInt(input);
        
            switch (ch){
                case 1: 
                    addressBook.addPerson(); 
                    break; 
                case 2: 
                    addressBook.searchPerson(); 
                    break; 
                case 3: 
                    addressBook.removePerson(); 
                    break; 
                case 4: 
                    System.exit(0); 
            }
        }
    }
}
