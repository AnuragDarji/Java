import java.util.*;

public class VowelConsonant{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Alphabet: ");
		char ch = obj.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant"); 
	}
}