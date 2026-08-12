package Looping;

public class WhileSimple {
    public static void main (String []args){
        int num =255;
        int n=5;
        int count=0;
        while(num>=n){
            num=num/n;
            count++;
            //System.out.println("Number of times num can be divided by  + count);
        }
        System.out.println("Number of times num can be divided by " + count);

        // infinite while loop as the condition is always true
        //while(true){
        //    System.out.println("This is an infinite loop");
        //  }
        /*
        expal as int n=1;
        while(true){
            System.out.println("This is an infinite loop");

            }if (n>10){
                break;
            }
         */
         }
    

}
