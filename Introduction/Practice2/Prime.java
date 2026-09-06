package Practice2;

public class Prime {
    public static void main(String[] args) {
        
        int nums = 11;
        boolean isPrime = true;
        // int count=0;
        for (int i = 2; i <= nums-1; i++) {
            //int count=0;
           // System.out.println(i);
            if (nums % i== 0) {
                isPrime = false;
               // count ++;
                //break;
            }
        }

        if (isPrime) {
        

            System.out.println(nums + " is a prime number.");
        } else {
            System.out.println(nums + " is not a prime number.");
        }
        
    }
    
}
