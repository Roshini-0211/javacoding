package oops;
 import java.util.Scanner;
public class atmvalidation {
    

class ATM {

    static void withdraw(int balance, int withdrawAmount, int pin) {

        // Check PIN
        if (pin != 1234) {
            System.out.println("Invalid PIN");
            return;
        }

        // Check positive amount
        if (withdrawAmount <= 0) {
            System.out.println("Withdrawal amount must be positive");
            return;
        }

        // Check multiple of 500
        if (withdrawAmount % 500 != 0) {
            System.out.println("Amount must be a multiple of 500");
            return;
        }

        // Check balance
        if (withdrawAmount > balance) {
            System.out.println("Insufficient balance");
            return;
        }

        // Successful withdrawal
        int remainingBalance = balance - withdrawAmount;

        System.out.println("Withdrawal successful");
        System.out.println("Remaining Balance = " + remainingBalance);

        // Warning
        if (remainingBalance < 1000) {
            System.out.println("Warning: Balance is below 1000");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int withdrawAmount = sc.nextInt();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        withdraw(balance, withdrawAmount, pin);
    }
}
    
}
