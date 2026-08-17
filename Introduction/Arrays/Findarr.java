package Arrays;

import java.util.Scanner;

public class Findarr {
      public static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length; i++){
            sum=sum+arr[i];
          //return sum;  
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
    int sum=sum(arr);
    System.out.println("sum is :"+sum);


}
    
}
