package Method;
        //method 2 => with return type with arguments 
public class Method2 {
    public static void main (String []args){
        Method2 ob=new Method2();
        int res=ob.add(8,5);
        System.out.println(" resukt is sum of : "+res);

    }
    public int add(int a,int b){
        int sum =a+b;
        return sum;
    }
    
}
