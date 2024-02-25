
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
//Scanner Input:
public class ConsoleMenu {
    public Company company;
    public Scanner scanner;
    
    //Constrcutor:
    public ConsoleMenu(Company company) {
        this.company = company;
        this.scanner = new Scanner(System.in);
    }
    
    //Method to run Console and Login Check:
    public void run() {
        if (!login()) {
            System.out.println("Login Failed");
            return;
        }
        
        //Main Menu Loop:
        boolean running = true;
        while (running) {
            System.out.println("\n1. View Current Staff\n2. Add New Staff\n3. Remove Staff\n4. Exit");
            System.out.print("Select an Option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
        
        //Select Otion of the Menu:
        switch (option) {
            case 1 -> viewStaff();
            case 2 -> addNewStaff();
            case 3 -> removeStaff();
            case 4 -> running = false;
            default -> System.out.println("Invalid option. PLease try again");
        }
    }
}
    //Method User Login:
    public boolean login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        return "Gnomeo".equals(username) && "smurf".equals(password);
        }

    //Methods:
    public void viewStaff() {
        int empNumThreshold = 4;
        company.listEmployees(empNumThreshold);
    }

    public void addNewStaff() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        Employee newEmployee = new Employee(name, email);
        company.addNewStaff(newEmployee);
    }
    
    public void removeStaff() {
        System.out.print("Enter Employee Number: ");
        int empNum = scanner.nextInt();
        company.removeStaff(empNum);
        scanner.nextLine();
    }

    //Main Method:
    public static void main(String[] arg) {
        Company company = new Company();
        ConsoleMenu menu = new ConsoleMenu(company);
        menu.run();
    }
}

