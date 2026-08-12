package Practice2;

public class PrimeinRange {
    public static void  main(String[]args){
        int n=11;
        for(int i=2;i<=n;i++){
            boolean isprime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isprime=false;

                }

            }
            if(isprime){
                System.out.println(i);
            }
        
        
    }
    
    }}

