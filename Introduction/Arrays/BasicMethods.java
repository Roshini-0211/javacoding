package Arrays;

public class BasicMethods {
    public static void main(String[] args) {
        //int not decalre they show default value as 0
        //type 2 using {}
        int  arr[]={10,23,34,45};
        int len=arr.length;
        for(int i=0;i<len;i++){
            System.out.println(arr[i]);
        }
        //System.out.println(arr[1]);
        System.out.println( );






        //type1-usig keyword
         int size=4;
        int arr1[]=new int[size];
        //initize array
        arr1[0]=45;
         arr1[1]=45;
          arr1[2]=45;
        //print arary
        for(int i=0;i<size;i++){
            System.out.println(arr1[i]);
        }


    }
    
}
