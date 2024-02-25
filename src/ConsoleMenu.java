
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ConsoleMenu {
    public Company company;
    public Scanner scanner;
    
    public ConsoleMenu(Company company) {
        this.company = company;
        this.scanner = new Scanner(System.in);
    }
    
    public void run() {
        if (!login()) {
            System.out.println("Login Failed");
            return;
        }
        
        boolean running = true;
        while (running) {
            System.out.println("View Current Staff. Add New Staff. Exit");
            System.out.print("Select an Option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
        
        switch (option) {
            case 1 -> viewStaff();
            case 2 -> addNewStaff();
            case 3 -> running = false;
            default -> System.out.println("Invalid option selected. PLease try again");
        }
    }
}

    public boolean login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        return "Gnomeo".equals(username) && "smurf".equals(password);
        }

    public void viewStaff() {
        int empNumThreshold = 3;
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

    public static void main(String[] arg) {
        Company company = new Company();
        ConsoleMenu menu = new ConsoleMenu(company);
        menu.run();
    }
}

