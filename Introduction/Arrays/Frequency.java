package Arrays;

public class Frequency {
    public static void main(String[] args) {
        int arr[]={10,30,10,30,30,15};
        int len=arr.length;
        boolean isvisited[]=new boolean[len];
        int count=1;
        for(int i=0;i<len;i++){
            if(isvisited[i]==false){
                //int count=1;
                isvisited[i]=true;
                for(int j=i+1;j<len;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        isvisited[j]=true;

                    }
                    
                }
                //majority
                //if (count>(len/2)){
                //    System.out.println(arr[i]);
                //}
System.out.println(arr[i]+"=>"+count);
            }
            if (count>(len/2)){
                    System.out.println(arr[i]);
                }
        }
    }
    
}
