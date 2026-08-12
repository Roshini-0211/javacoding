package Practice2;
import java.util.Scanner;
public class DNAFactorial {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter th efactorial number : ");
    int n=sc.nextInt();
    int fac=1;
    for(int i=1;i<=n;i++){
        fac=fac*i;
      //  System.out.println(fac);
    }
    System.out.println(n+"the factorial is : " +fac);
    sc.close();
    }

    
}
