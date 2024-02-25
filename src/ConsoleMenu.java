
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
        
        switch (option) {
            case 1: 
                viewStaff();
                break;
            case 2:
                addNewStaff();
                break;
            case 3:
                removeStaff();
                break;
            case 4:
                running = false
                break;
            default:
                System.out.println("Invalid option selected. PLease try again");
                break;
        }
    }
}

public boolean login() {
System.out.print("Enter username: ");
String = scanner.nextLine();
System.out.print("Enter password: ");
String password = scanner.nextLine();
return "Gnomeo".equals(username) && "smurf".equals(passowrd);
}
