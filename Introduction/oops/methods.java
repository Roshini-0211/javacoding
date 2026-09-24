package oops;
import java.util.*;
public class methods {
    
       
    
    
   public static void main(String[] args) {
    Student s1 = new Student();
    s1.name="Rose";
    s1.dep="CSE";
    s1.rollno=101;
    s1.age=20;
    System.out.println("1st Student Details : \n"+s1.name+" "+s1.dep+" "+s1.rollno+" "+s1.age);
    s1.exam();
    s1.study(); 
    System.out.println("********************************");
     Student s2 = new Student();
    s2.name="John";
    s2.dep="IT";
    s2.rollno=102;
    s2.age=21;
    System.out.println("2nd Student Details : \n"+s2.name+" "+s2.dep+" "+s2.rollno+" "+s2.age);
    s2.exam();
    s2.study();

   
   }
    
}
class Student{
        String name;
        String dep;
        int rollno;
        int age;


         void exam(){
            System.out.println(name+"is going to attend the exam");
        
    }
    
        void study(){
            System.out.println(name+" is studying in "+dep+" department");
        }
    
    }



    //do learn girl you froget something lik einitialize and decalre 