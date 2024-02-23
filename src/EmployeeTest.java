/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class EmployeeTest {
     
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Employee e1 = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee e2 = new Employee("Ann Banana", "ab@gmail.com");
        Employee e3 = new Employee("Tom Thumb", "tt@gmail.com");
   
        Employee[] projectGroup = {e1, e2, e3};
        
        System.out.println("Next Employee Number: " + Employee.getNextEmpNum());
   
        int m = 0;
        for (Employee emp : projectGroup) {
            if (emp.getEmpNum() > m) {
                System.out.println(emp.getName());
            }
        }
    }
}
