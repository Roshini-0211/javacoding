package oops;

class account {
  private long accno;
    private String name;
    private float amount;

    account(long accno, String name, float amount) {
        this.accno = accno;
        this.name = name;
        this.amount = amount;
    }
    public void setamount(float amount){
        if(amount>0){
            this.amount=amount;
        }
        else{
            System.out.println("invalid amount");
            return;
        }

    }
    public float getamount(){
        return amount;
    }
}

public class encapsulation {
    public static void main(String[] args) {

        account a1 = new account(101346789023456789L, "Rose", 5000);
        account a2 = new account(102234567890L, "John", 6000);
a1.getamount();
        a1.setamount(7000);
       
       a1.getamount();
       
    }
}