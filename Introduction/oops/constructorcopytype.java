package oops;

public class constructorcopytype {
    public static void main(String[] args){
         
         Students S1 =new Students("Rose");
         Students S2 =new Students(S1);
System.out.println(S1.name);
System.out.println(S2.name);


    }
    
    
}
//copy constuctor 
//contsrovctr no return type only print 
class Students{
    String name;
    
    Students(String name){
        this.name=name;
        System.out.println("the object i s created with name: ");
    }
    Students(Students M){
        this.name=M.name;
        
    }
    
}
