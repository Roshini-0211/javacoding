package String;

public class StringBasic {
    public static void main(String[] args) {
        String str ="java programming";

        //concte string 
        String s=str.concat("t");
        
        System.out.println(s);
        //ewhy not pront concate we need to createa new string okay look note 
        
        //length()-> of the string 
        int len=str.length();
        System.out.println("length :"+len);
//System.out.println("acces index : : "+str.charAt(12));
        //CharAt()-> access a specific char 
        char ch=str.charAt(13);
        
        System.out.println("access char : "+ch);

        //substring(start index,endindes +1)->to find sub string 
        String substr=str.substring(0,5);
        System.out.println("the sub string of str is : "+substr);
        
        //to upper case 
        System.out.println("upper case : "+str.toUpperCase());

        ////to lower case 
        System.out.println("lower case : "+str.toLowerCase());

        //comapre 
        boolean issame=str.equals("java programming");
        System.out.println("same compare: "+issame);

        
        System.out.println("---------------------------------compare----------------------------------");
        String name="Rahul";
        boolean isname=name.equals("rahul");
        boolean isname1=name.equals("Rahul");
        System.out.println("same compare like iwthh cas sensetive "+isname);//false
         System.out.println(isname1);//true

         //boolean equalsIgnoreCase
         boolean issamecase=name.equalsIgnoreCase("rahul");
         System.out.println("Without case sensetive : "+issamecase);//true

         System.out.println("---------------------------contains--------------------------------------------");

         //to check contains  //to check a substring contains  by the string 
         System.out.println("to check contains <java> are not :  "+str.contains("java"));

         //to replace the substring  or char
         System.out.println("replace  python : "+str.replace("java","python"));


        
    }
    
}
