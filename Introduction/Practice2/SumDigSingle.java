package Practice2;

public class SumDigSingle {
    public static void main(String[] args) {
        int n=1234;
       // int sum=0;
        while(n>=9){
           int sum=0;
            for(int i=n;i>0;i++){
                int rem=i%10;
                sum=sum+rem;
                i=i/10;
                 n=sum;
            }
           // n=sum;

        }
        System.out.println(n);
    }
    
}
