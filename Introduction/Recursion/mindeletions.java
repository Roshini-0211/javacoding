package Recursion;

import java.util.Arrays;

public class mindeletions {
     static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

    public static int minDeletions(int[] nums,int[] numsDivide){

        int g=numsDivide[0];

        for(int i=1;i<numsDivide.length;i++){
            g=gcd(g,numsDivide[i]);
        }

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(g%nums[i]==0){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){

        int[] nums={2,3,2,4,3};
        int[] numsDivide={9,6,9,3,15};

        System.out.println(minDeletions(nums,numsDivide));
    }
}
