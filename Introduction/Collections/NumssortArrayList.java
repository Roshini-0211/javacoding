package Collections;
import java.util.*;
import java.util.ArrayList;

public class NumssortArrayList {
    public static void main(String[] args) {
        
    
    ArrayList<Integer> nums=new ArrayList<>();
        
        nums.add(3);
        nums.add(4);
        nums.add(6);


        //sort the list
        //we nned package for this 
        Collections.sort(nums);

        System.out.println(nums);
    
}
}