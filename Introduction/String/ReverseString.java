package String;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       // String str="hello";
        int len=str.length();
        String reverse ="";
        for(int i=len-1;i>=0;i--){
        //String  s1= str.charAt(i);
        reverse=reverse+str.charAt(i);
       // reverse=reverse+s1;

 System.out.println(reverse);
            
        }
        System.out.println(reverse);
        sc.close();
    }
    }
    

