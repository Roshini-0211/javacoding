package Exception;


public class throwexception {
    public static void main(String[] args) {
        int balance=50000;
        int withdrawn=222000;
        try{
            if(withdrawn>balance){
                throw new InsufficientbalanceException("withdrawn balanace should be less than balance");
            }else{
                System.out.println("amount withdrawn");
            }
        }
        catch(InsufficientbalanceException e){
            System.out.println(e.getMessage());
        }
    }
    
}
class InsufficientbalanceException extends Exception{
    InsufficientbalanceException(String msg){
    super(msg);
    }
}
//check whether an insuufient exception want to throw lik ei n ctach 