package Method;
import java.util.*;
public class ReverseMethod1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num : ");
        int num=sc.nextInt();
    ReverseMethod1 obj=new ReverseMethod1();
        int rev=obj.reverse(num);
        System.out.println(rev);
    }
    public int reverse(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev =rev*10+rem;
            n=n/10;
        }
        return rev;
        


    }
    

}
