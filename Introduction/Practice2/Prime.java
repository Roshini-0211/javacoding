package Practice2;

public class Prime {
    public static void main(String[] args) {
        
        int num = 11;
        boolean isPrime = true;
        // int count=0;
        for (int i = 2; i <= num-1; i++) {
            //int count=0;
           // System.out.println(i);
            if (num % i== 0) {
                isPrime = false;
               // count ++;
                //break;
            }
        }

        if (isPrime) {
        

            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
    }
    
}
