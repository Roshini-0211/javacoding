package PracticeProblem;
import java.util.Scanner;
public class ConSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  A : ");
       float a=sc.nextFloat();
       System.out.print("Enter  B : ");
       float b=sc.nextFloat();
       System.out.print("Select Operator : ");
       char ch= sc.next().charAt(0);
       switch(ch){
        case '+':
            System.out.println("The Sum is : "+(a+b));
            break;
        case '-':
            System.out.println("The sub is:"+(a-b));
            break;
        case '*':
            System.out.println("The multi is : "+(a*b));
            break;
        case'/':
             System.out.println("The deivision is "+(a/b));
            break;
        default:
            System.out.println("that invalid operator");
    }
       
       if (ch == '+'){
       System.out.println(a+b);
       }else if (ch == '-'){
        System.out.println(a-b);

       }else if (ch == '*'){
        System.out.println(a*b);
       }else if (ch == '/'){
        System.out.println(a/b);

       }else {
        System.out.println("invalid operator");
       }
        


    }
    
}
