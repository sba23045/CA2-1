
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
    
    public Company() {
        this("Business Gnómes Ltd");
        this.staff = new ArrayList<>();
    }
    
    public Company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }
    
    public void addNewStaff(Employee employee) {
        staff.add(employee);
    }
    
    public int getStaffNumber() {
        return staff.size();
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

    void removeStaff(int empNum) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
