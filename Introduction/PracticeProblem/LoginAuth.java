package PracticeProblem;
import java.util.Scanner;
public class LoginAuth {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter username ");
       String username=sc.nextLine();
       System.out.println("Enter password ");
       String password=sc.nextLine();
       if (username.isEmpty()) { 
            System.out.println("Login failed: Username cannot be empty!"); 
        } else if (password.length() >= 6) { 
                System.out.println("Login successful!"); 
            } else { 
                System.out.println("Login failed: Password must be 6 or more characters!"); 
            } 
        }
        
       
       
        }
    
    

