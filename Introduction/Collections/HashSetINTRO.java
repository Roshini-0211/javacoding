package Collections;

import java.util.HashSet;
//package Collections;

public class HashSetINTRO {
    public static void main(String[] args) {
        
    
    // declear ->integer
    HashSet<Integer> set= new HashSet<>();
    //add()-> to add the element in Hashset()
    set.add(5);
    set.add(15);
    set.add(8);
    set.add(29);
    set.add(105);
    System.out.println("Orginal Hashset:"+set);
    set.add(15);
    System.out.println("After adding 15 is : "+set );
    // to check element contains by hashset or not
    System.out.println("is contains?"+set.contains(15));
    //removing element
    set.remove(105);
    System.out.println(set);
    // to Itrate over hashset
    for(int num:set){
        System.out.println(num+" ");
    }
    //remove everything from hashset
    set.clear();
    System.out.println(" clearing : "+set);

    
}
}