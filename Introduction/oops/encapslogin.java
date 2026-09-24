package oops;

public class encapslogin {
    public static void main(String[] args) {
        UserAccount user = new UserAccount("john_doe", "password123", "john.doe@example.com", 0);
    
System.out.println(user.getUsername());
System.out.println(user.getEmail());
user.login("wrongpassword");
user.login("password123");
user.login("password123");
    user.resetPassword("password123", "newpassword456");
    user.login("newpassword456");
}
}
class UserAccount{
   private String username;
   private String password;
   private String email;
    private int loginAttempts;
    
     // Constructor
     public UserAccount(String username, String password, String email, int loginAttempts) {
          this.username = username;
          this.password = password;
          this.email = email;
          this.loginAttempts = 0;
     }
    
     // Getter for username
     public String getUsername() {
          return username;
     }
    
     // Getter for email
     public String getEmail() {
          return email;
     }
    
    
     public void login(String password) {
    
          
          if (loginAttempts >= 3) {
                System.out.println("Account is locked.");
                return;
          }
    
          // Check password
          if (this.password.equals(password)) {
                System.out.println("Login successful.");
                
                return;
          } else {
                loginAttempts++;
                System.out.println("Wrong password.");
    
                if (loginAttempts == 3) {
                 System.out.println("Account is now locked.");
                } 
    
                return;
          }
     }
    
   
     public void resetPassword(String oldPass, String newPass) {
    
          if (this.password.equals(oldPass)) {
                this.password = newPass;
                loginAttempts = 0;
                System.out.println("Password reset successful.");
                return;
          } else {
                System.out.println("Old password is incorrect.");
                return;
          }
     }
}
