package Collections;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        //declare a ArrayList -> String
        ArrayList<String> list=new ArrayList<>();
        //add()-> to insert the element th end of the array 
        list.add("is ");
        list.add("a ");
        list.add("beautyful ");
        list.add("flower");
        //addFirst() -> to add tthe elemnet front of array list 
        list.addFirst("rose");
        //addLast()-> tio ensure addig element end of the list 
        list.addLast("we know");

        //list in add new on e
        System.out.println("add : "+list.add("hello"));

       //set()-> to replace an element in a sepecific index position 
        list.set(5,"i know ");

        //add(index,elemet)-> insert the element in specific index position 
        list.add(2,"also");

        //get(index)-> to retrive an elemnt from 
        System.out.println("second element is : "+list.get(2));

        //to print array list 
        System.out.println("list : "+list);

        //to print aray lost 
        System.out.println("org list :"+list);

        //to find th size if array lst 
        System.out.println("size : "+list.size());

        //to retirve alal the elmts from aaray lst 
        //is used deal with elamemnt not deal index 
        System.out.println("usong for llop retrive list");
        for (int  i=0;i<list.size();i++){
System.out.println(list.get(i)+" ");
        }
        //using the for each loop to don =e aarray list not use index
        for(String s:list){
            System.out.println(s+" ");
        }
 //remove() -> using objrect 
 list.remove("hello");
        System.out.println(list);

        //remove()-> uinsg index
        list.remove(4);

        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(4);
        nums.add(6);


        //sort the list
        //we nned package for this 
        Collections.sort(nums);

        System.out.println(nums);


    }
    
}
