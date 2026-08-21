package String;

public class RemovSpace {
    public static void main(String[] args) {
        String str="how are you ? ";


        //approch 1 ->using replace 
        String strreplace=str.replace(" ","");
        System.out.println("after removing space using replace : "+strreplace);


        //approch 2 
        int len=str.length();
        String newString ="";
        for(int i=0;i<len;i++){
            char ch=str.charAt(i);
            if(ch !=' '){
                newString =newString+ch;


            }
           // System.out.println(newString);
        }
         System.out.println(newString);
    }
    
}
