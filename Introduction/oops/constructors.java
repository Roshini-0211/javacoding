package oops;

public class constructors {
     public static void main(String[] args) {
        Students S =new Students();
    }
    
    
}
//nonparameterized constuctor 
//contsrovctr no return type only print 
class Students{
    String name;
    Students(){
        System.out.println("the object is created ");
    }
    
}
