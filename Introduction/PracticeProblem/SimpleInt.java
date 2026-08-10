package PracticeProblem;

public class SimpleInt {
    public static void main(String[] args) {
        int n=10;
        int m=45;
        
        for(int i=n;i<=m;i++){
           int n1=i%10;
           int n2 =i/10;
           int sum=n1+n2;
           int product=n1*n2;
           int result =sum+product;
           
           if(result==i){
            System.out.print(i+" ");
           }
           
        }
    
        
    
}
}