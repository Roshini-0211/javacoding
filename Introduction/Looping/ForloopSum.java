package Looping;

public class ForloopSum {
    public static void main(String[]args){
int n=5;
int sum =0;
for(int i=1;i<=n;i++){
    sum =sum+i;
    //why thsi print as iterstite go look note why 1,3,6
System.out.println(sum);
}
//becsaue loop end 5 after not execute  //print sum after loop end
System.out.println("Sum: "+sum);
    }
    
}
