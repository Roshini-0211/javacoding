package Arrays;

public class ReverseArray {
    public static void reversearr(int[] arr){
        int l=0;  //start with 0 index position 
        int r=arr.length-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};        
        reversearr(arr);
        System.out.println("After reversing : "); //why, how works after the method call
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //another method
        //for(int val: arr){
        //   System.out.print(val+" ");
        //}
        
        
    }
    
}
