import java.util.*;

class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = sc.next();
        String nstr="";
        char ch;
        
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i); // char at index
            nstr = ch+nstr;
        }
        System.out.println("Reversed word: "+nstr);
    }
}
