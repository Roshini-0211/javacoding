package oops;
 import java.util.Scanner;
public class employeesalary {
   

class EmployeeBonus {

    static double calculateSalary(double salary, int experience, int rating) {

        double experienceBonus = 0;
        double performanceBonus = 0;
        double additionalBonus = 0;

        // Experience bonus
        if (experience < 2) {
            experienceBonus = 0;
        } 
        else if (experience <= 5) {
            experienceBonus = salary * 5 / 100;
        } 
        else if (experience <= 10) {
            experienceBonus = salary * 10 / 100;
        } 
        else {
            experienceBonus = salary * 15 / 100;
        }

        // Performance bonus
        if (rating == 5) {
            performanceBonus = salary * 20 / 100;
        } 
        else if (rating == 4) {
            performanceBonus = salary * 15 / 100;
        } 
        else if (rating == 3) {
            performanceBonus = salary * 10 / 100;
        } 
        else if (rating == 2) {
            performanceBonus = salary * 5 / 100;
        } 
        else {
            performanceBonus = 0;
        }

        // Additional 5%
        if (experience > 10 && rating == 5) {
            additionalBonus = salary * 5 / 100;
        }

        double finalSalary = salary
                + experienceBonus
                + performanceBonus
                + additionalBonus;

        return finalSalary;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter experience: ");
        int experience = sc.nextInt();

        System.out.print("Enter rating: ");
        int rating = sc.nextInt();

        double result = calculateSalary(salary, experience, rating);

        System.out.println("Final Salary = " + result);
    }
}
    
}
