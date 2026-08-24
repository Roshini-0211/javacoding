package leetcodebasic;
import java.util.*;
public class Strobogrammatic {
    public static boolean isstrobrogrammatic(String s){
        HashMap<Character, Character> map=new HashMap<>();
       
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');
        int l=0,r=s.length()-1;
        while(l<=r){
            if(!map.containsKey(s.charAt(l))){
                return false;
            }
            if(s.charAt(l)!=map.get(s.charAt(r))){
                return false;
            }
            l++;
            r--;

        }
        return true;


    }
    public static void main(String[] args) {
        String s="6810189";
        boolean res=isstrobrogrammatic(s);
        System.out.println(res);
    }
    
}
