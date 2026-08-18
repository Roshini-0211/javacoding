package Collections;
import java .util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap();
        // to store key-value pairs in HashMap
         map.put("name","rose");
         map.put("area"," pkc ngar");
         map.put("house no","30c");
         map.put("district","dpi");
         map.put("name","rose");
        System.out.println("Original map: "+map);

        //Update element in hashmap
        map.put("house no","40a");
        System.out.println("After update house no 40A"+map);

        //get()->using key get the value
        System.out.println("Area:"+map.get("area"));
        
        //containsKey()-> to check is key exit or not 
       System.out.println(map.containsKey("district"));

       //containsKey()-> to check is key exit or not 
       System.out.println(map.containsValue("rose"));

       //find size of the  map 
       System.out.println("size : "+map.size());
      
       //remove th element 
map.remove("house no");

//iterate over map 
for (Map.Entry<String ,String> e:map.entrySet()){
    String key=e.getKey();
     String Value =e.getValue();
     System.out.println(key+" : "+Value);
    


}

// print only want the key frmom hashmap
System.out.println("Keys on MAP " +map.keySet()); 
//System.out.println(map);

    }
    
}
