/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author faith
 */
public class Contact {
    private String name;
    private String phone;
        
        //constructors
    public Contact() {
        name = "unknown";
        phone = "unknown";
    }
        
    public Contact(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
        
       
	
//	setters and getters for instance variables
    public void set_name(String newName) {
        this.name = newName;
    }
    
    public String get_name(){
        return this.name;
    }
    
    public void set_phone(String newPhone) {
        this.phone = newPhone;
   
    }
    
    public String get_phone(){
        return this.phone;
    }
}
