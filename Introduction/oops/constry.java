package oops;

public class constry {
    public static void main(String[] args){
         
         Students S1 =new Students("Rose");
         Students S2 =new Students("John", 20);
System.out.println(S1.name);
System.out.println(S2.name);


    }
    
    
}
//copy constuctor 
//contsrovctr no return type only print 
class Students{
    String name;
    int age;
    Students(String name){
        this.name=name;
        System.out.println("the object i s created with name: ");
    }
    Students(Students M){
        this.name=M.name;
        
    }
    Students(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("the object is created with name: " + name + " and age: " + age);
    }
}
