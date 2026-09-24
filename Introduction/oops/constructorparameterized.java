package oops;

public class constructorparameterized {
    public static void main(String[] args){
         Students S =new Students();
         Students S1 =new Students("Rose");
System.out.println(S1.name);
System.out.println(S.name);


    }
    
    
}
//parameterized constuctor 
//contsrovctr no return type only print 
class Students{
    String name;
    Students(){
        
    }
    Students(String name){
        this.name=name;
        System.out.println("the object i s created with name: ");
    }
    
    }
    

