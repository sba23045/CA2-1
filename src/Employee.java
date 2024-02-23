/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class Employee {

    /**
     * @param args the command line arguments
     */
  
    //Instance fields:
    String name;
    String email;
    int empNum;
    
    //Static field:
    public static int nextEmpNum = 1;
    
    public Employee() {
        this("Default Name", "Default@gmail.com");
    }
    
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }
    
    }
    
}
