package Practice2;

public class Amstrong {
    public static void main(String[] args) {
        int n=153;
        int sum=0;
        for(int i=n;i>0;i=i++){
            int rem=i%10;
            sum=sum+(rem*rem*rem);
            i=i/10;
        }
        if(sum==n){
            System.out.println("Amstrong");
        }else{
            System.out.println("Not Amstrong");
        }
    }
    
}
