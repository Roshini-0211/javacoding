package PracticeProblem;
import java.util.Scanner;
public class Dayone {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //WAP to find the sum of two numbers
        /* 
        System.out.println("Enter two numbers to find the sum :");
        int num1=sc.nextInt();
        System.out.println("Enter the second number :");
        int num2=sc.nextInt();
        int num3=num1+num2;
        System.out.println("the sum of " + num1 + " and " + num2 + " is : " + num3);
        System.out.printf("num3:%d",num3);
        */


        //WAP to find the average of two numbers
        
        System.out.println("Enter two numbers to find the average :");
        float num1=sc.nextFloat();
        System.out.println("Enter the second number :");
        float num2=sc.nextFloat();
        float avg=(num1+num2)/2;
        System.out.println("the average of " + num1 + " and " + num2 + " is : " + avg);
        System.out.printf("avg:%.2f",avg);
        sc.close();
        
        
    }
    
}


