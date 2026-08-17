package Arrays;
import java.util.Scanner;
public class Sumarr {

    public  static int Calsum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length; i++){
            sum=sum+i;//th splac eas array [i]mistacke in the place 
        }
        return sum;  
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int sum=Calsum(arr);
    System.out.println("sum is :"+sum);


}
    
}
