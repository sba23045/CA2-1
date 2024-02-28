
import java.util.ArrayList;
import java.util.HashSet;
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
    public HashSet<Integer> staffSet;

    //Default Constructor:
    public Company() {
        this.companyName = "Business Gnómes Ltd";
        this.staff = new ArrayList<>();
        this.staffSet = new HashSet<>();
    }

    //Overloaded Constructor:    
    public Company(String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
        this.staffSet = new HashSet<>(); 
    }
    
    //Methods:
    public void addNewStaff(Employee employee) {
        if (staffSet.add(employee.getEmpNum())) {
            staff.add(employee);
        } else {
            System.out.println("Employee with this number already in the system.");
        }
    }
    
    public int getStaffNumber() {
        return staff.size();
    }
    
    public void removeStaff(int empNum) {
        staff.removeIf(employee -> {
            boolean match = employee.getEmpNum() == empNum;
            if (match) {
                staffSet.remove(empNum);
            }
            return match;
        });
    }
    
    public void listEmployees(int empNumThreshold) {
        Iterator<Employee> iterator = staff.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpNum() > empNumThreshold) {
                System.out.println("Employee Name: " + employee.getName() + ", Employee Number: " + employee.getEmpNum());
            }
        }
    }
}
