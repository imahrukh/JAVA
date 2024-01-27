import javax.swing.*;
public class Person{
    private String name;
    private String address;
    private String contactNo;
    
    public Person(String name,String address, String contactNo){
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getContactNo(){
        return contactNo;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setAddress(String address){
        this.address=address;
    }
    
    public void setContactNo(String contactNo){
        this.contactNo=contactNo;
    }
    
    public void display(){
        JOptionPane.showMessageDialog(null, "name: " + name + "\naddress:" +address + "\ncontact no:" + contactNo);
    }
}
