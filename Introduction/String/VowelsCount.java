package String;

public class VowelsCount {
    public static void main(String[] args) {
        
        String str="education";
        int vowels=0;
        int cons=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if ( ch=='a'|| ch=='e' ||   ch=='i' ||   ch=='o' ||   ch=='u' ) {
                vowels++;

            }else{
                cons++;
            }
             

        
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + cons);System.out.println(vowels+cons);




        ///apparaoch 2
        String str1="aeiou";
        if(str1.contains(ch + "")){
            vowels++;
        }else{
            cons++;
        }
//System.out.println("vowels"+vowels+"consonants"+cons);
    }
}
    
}
