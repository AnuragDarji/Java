import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        String nstr = "";
        char ch;

        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            nstr = ch + nstr;
        }

        if(str.equals(nstr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
