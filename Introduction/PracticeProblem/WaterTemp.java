package PracticeProblem;

public class WaterTemp {
    public static void main(String[] args) {
    int  temp=15;
    if(temp<20){
        System.out.println("Cold water");
    }else if(temp>=20 && temp<=40){
        System.out.println("Normal water");
    }else if(temp>40){
        System.out.println("Hot water");
    }
    
}
}