package Arrays;
import java.util.*;
public class MaxMinINT {
    //finfing macx avlue
   public static void findmax(int[] nums){
    int max=nums[0];
    for(int i=1;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
    }
    System.out.println("the Maximum values i s: "+max);

   }
   //find min value 
   public static void findmin(int[] num){
    int min=num[0];
    for(int i=1;i<num.length;i++){
        if(num[i]<min){
            min=num[i];
        }
    }
    System.out.println("Minimun value : "+min);

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
        findmin(nums);

        }
    }

