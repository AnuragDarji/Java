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

// ========== 2nd way ===========

class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<=sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println("reversed string: "+sb);
    }
}
