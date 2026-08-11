package PracticeProblem;

public class SumDigSingle {
    public static void main(String[] args) {
        int n=1234;
        while(n>=9){
            int sum=0;
            for(int i=n;i>0;i=i/10){
                int rem=i%10;
                sum=sum+rem;
            }
            n=sum;

        }
        System.out.println(n);
    }
    
}
