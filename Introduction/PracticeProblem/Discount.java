package PracticeProblem;
import java.util.Scanner;
public class Discount {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age=sc.nextInt();
        System.out.print("Enter the price : ");
        float price=sc.nextFloat();
        float discount;
        float finalPrice;
        if(age<12){
            discount=50;
            System.out.println("the discount applied"+ discount);
        }else if (age>=12 && age<=60){
            discount=0;
            System.out.println("No discount");
        }else{
            discount=30;
             System.out.println("the discount applied"+discount);
        }
        finalPrice=price-(price*(discount/100));

        System.out.println("Final Price is : "+finalPrice);
    }
    
}
