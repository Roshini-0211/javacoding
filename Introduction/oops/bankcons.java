package oops;

class account{
    long accno;
     String name;
    float amount;
    account(long accno, String name, float amount){
        this.accno=accno;
        this.name=name;
        this.amount=amount;

    }
    void display(){
        System.out.println(accno + " " + name + " " + amount);
    }
}
public class bankcons {
public static void main(String[] args){
    account a1=new account(101346789023456789l,"Rose",5000);
    account a2=new account(102234567890l,"John",6000);
    System.out.println("Account details are: "+a1.name + " " + a1.accno + " " + a1.amount);
    System.out.println("Account details are: "+a2.name + " " + a2.accno + " " + a2.amount);
    a1.display();
    a2.display();
    
}
}
