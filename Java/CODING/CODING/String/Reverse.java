import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String nstr="";
        char ch;

        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            nstr = ch + nstr;
        }

        System.out.println(nstr);
    }
}
