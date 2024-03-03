/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//GITHUB: https://github.com/sba23045/CA2-1.git

/**
 *
 * @author User
 */

//SubClass
public class Manager extends Employee {
    private String username;
    private String password;
    
    //Add Super Class Constructor:
    public Manager(String name, String email, String username, String password) {
        super(name, email);
        this.username = username;
        this.password = password;
    }
    
    // Getters
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    // Setters
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    } 
}
