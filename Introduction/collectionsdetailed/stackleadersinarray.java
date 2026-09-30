package collectionsdetailed;

import Collections.Arraylist;

import java.lang.reflect.Array;
import java.util.*;
public class stackleadersinarray {
    public static void main(String[] args) {
       int[] arr={16,17,4,3,5,2};
       Stack<Integer>s=new Stack<>();
        s.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            int cur=arr[i];
            if(cur>s.peek()){
                s.push(cur);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }

    }
    
}
