package Method;
//method 3=> without return type and with arguments
public class Method3 {
    public void add(int a ,int b){
int sum=a+b;
System.out.println("sum is : "+sum);
    }
    public static void main(String[]args){
        Method3 ob=new Method3();
        ob.add(4,5);

    }
    
}
