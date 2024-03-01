/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class Employee {
  
    //Instance fields:
    private String name;
    private String email;
    private int empNum;
    
    //Static field:
    private static int nextEmpNum = 1;
    
    //Two Constructors: 
    public Employee() {
        this("Default Name", "Default@gmail.com");
    }
    
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }
    
    //Methods:
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getEmpNum() {
        return empNum;
    }
    
    public void setEmail(String email) {
        if (email.length() > 3) {
            this.email = email;
        }
    }   
    public static int getNextEmpNum() {
        return nextEmpNum;
    }
}