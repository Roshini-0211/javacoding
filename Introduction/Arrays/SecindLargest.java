package Arrays;

import java.util.Scanner;

public class SecindLargest {

public static void findmax(int[] nums){
    int max1=nums[0];
    int max2=max1;

    for(int i=1;i<nums.length;i++){
        if(nums[i]>max1){
            max2=max1;
            max1=nums[i];
        
        }
    }
    System.out.println("the Maximum values 1 is  s: "+max1);
System.out.println("the Maximum values 2 s: "+max2);

   }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter a array size : ");
        int n=sc.nextInt();

        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            //System.out.println("Enter th elements 5 : ");
            nums[i]=sc.nextInt();
//System.out.println("Enter th elements 5 : ");
        }
    findmax(nums);
    }
}

