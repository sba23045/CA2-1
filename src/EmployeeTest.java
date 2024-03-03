/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//GITHUB: https://github.com/sba23045/CA2-1.git

/**
 *
 * @author User
 */
public class EmployeeTest {
     
    /**
     * @param args the command line arguments
     */
    
    //List of Employee:
    public static void main(String[] args) {
        Employee e1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee e2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee e3 = new Employee("Tom Thumb", "tt@gmail.com");
        
    //Declaring an array:
        Employee[] projectGroup = {e1, e2, e3};
    
    //Printing out the value of variable:
        System.out.println("Next Employee Number: " + Employee.getNextEmpNum());
    
    //Search and Display the name of each of the employees:
        int m = 2;
        for (Employee employee : projectGroup) {
            if (employee.getEmpNum() > m) {
                System.out.println(employee.getName());
            }
        }
    }
}
