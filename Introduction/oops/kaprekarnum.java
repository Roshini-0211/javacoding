package oops; 
import java.util.Scanner; 

public class kaprekarnum { 

    public static boolean isKaprekar(int n) { 
        if (n <= 0) return false;
        if (n == 1) return true; 

        // Use long to prevent integer overflow during squaring
        long square = (long) n * n; 
        
        // Count digits of the original number
        int digits = 0;
        int temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Calculate divisor
        long divisor = 1; 
        for (int i = 1; i <= digits; i++) { 
            divisor *= 10; 
        } 

        // Split the square
        long left = square / divisor; 
        long right = square % divisor; 

        // The right hand part cannot be zero if the original number wasn't 1
        if (right == 0) {
            return false;
        }

        return (left + right) == n; 
    } 

    public static void printKaprekar(int start, int end) { 
        for (int n = start; n <= end; n++) { 
            if (isKaprekar(n)) { 
                System.out.println(n); 
            } 
        } 
    } 

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter starting number: "); 
        int start = sc.nextInt(); 
        System.out.print("Enter ending number: "); 
        int end = sc.nextInt(); 
        
        System.out.println("Kaprekar numbers:"); 
        printKaprekar(start, end); 
        
        sc.close();
    } 
}
