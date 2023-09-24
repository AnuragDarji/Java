import java.util.*;

class Vowals{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        
        int vowels = 0;
        int consonants = 0;
        
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
         
        System.out.println("Vowels: "+vowels);
        System.out.println("consonants: "+consonants);
    }
}