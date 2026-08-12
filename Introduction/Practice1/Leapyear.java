package Practice1;

public class Leapyear {
    public static void main (String[]args){
        int year = 2015; 

        if (year % 4 == 0){ 
            if (year % 100 == 0){ 
                if (year % 400 == 0){ 
                    System.out.println(year + " is a leap year"); 
                } else { 
                    System.out.println(year + " is not a leap year"); 
                } 
            } else { 
                System.out.println(year + " is a leap year"); 
            } 
        } else { 
            // FIX: This handling was missing! 
            // If a year is not divisible by 4, it can never be a leap year.
            System.out.println(year + " is not a leap year"); 
        } 
           /*if((year%4==0 && year%100!=0 )|| year%400==0){
            System.out.println(year +" is a leap year");
           }else{
            System.out.println(year +" is not a leap year");
           }*/
    
    
}
}

