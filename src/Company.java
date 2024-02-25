
import java.util.ArrayList;
import java.util.Iterator;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Company {
    public String companyName;
    public ArrayList<Employee> staff;

    //Default Constructor:
    public Company() {
        this("Business Gnómes Ltd");
        this.staff = new ArrayList<>();
    }

    //Overloaded Constructor:    
    public Company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }
    
    //Methods:
    public void addNewStaff(Employee employee) {
        staff.add(employee);
    }
    
    public int getStaffNumber() {
        return staff.size();
    }
    
    public void removeStaff(int empNum) {
        staff.remove(empNum);
    }
    
    public void listEmployees(int empNumThreshold) {
        Iterator<Employee> iterator = staff.iterator();
        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getEmpNum() > empNumThreshold) {
                System.out.println(emp.getName());
            }
        }
    }
}
