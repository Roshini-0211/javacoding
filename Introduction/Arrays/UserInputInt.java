package Arrays;
import java.util.*;
public class UserInputInt {
    static void printarray(String[] name){
        System.out.println("Nmaes : ");
        for(int i=0;i<name.length;i++){
System.out.println(name[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        String name[]=new String[n];
        System.out.println("enter array eleaments : ");
     
        for(int i=0;i<n;i++){
            name[i]=sc.next();
            //System.out.println(name[i]);
        }
        //System.out.println(name[0]);
        printarray(name);
    }
    
}
