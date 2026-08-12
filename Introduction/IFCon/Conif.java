package IFCon;



public class Conif {
    
    public static void main(String[] args){
        //thi sfor if nested if else
        int age=02;
        if(age>=18){
            // System.out.println("adult");
            if (age>=60){
                System.out.println(" You are a pure gentelman  senior citizen");
                
            }else{
                System.out.println("Try much better Man : Enjoy yourself ");
            }
        }else{
           // System.out.println("minor");
            if(age<=10){
                System.out.println("Crying babby ");
            }else{
                System.out.println("You are a teenager ");
            }
        }
    }
    
}
