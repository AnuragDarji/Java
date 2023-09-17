import java.util.*;
public class Strings{
	public static void main(String[] args) {
		//String Declaration
		// String name = "Anurag";

		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		// String name = sc.next(); // print word -> Line not print
		String name = sc.nextLine();
		System.out.println("your name is: "+name);
		*/

		/*
		//concatenation
		String firstName = "Anurag";
		String lastName = "Darji";
		String fullName = firstName +" "+ lastName;
		// System.out.println(fullName);
		System.out.println(fullName.length());

		//charAt
		for(int i=0; i<fullName.length(); i++){
			System.out.println(fullName.charAt(i));
			// System.out.print(fullName.charAt(i));
		}
		*/

		//compare
		String name1 = "Tony";
		String name2 = "Tony";

		//1. s1>s2 : +ve value
		//2. s1==s2 : 0
		//3. s1<s3 : -ve value

		//ex:- aahello > aabello

		// if(name1.compareTo(name2) == 0){
		// 	System.out.println("String are equal");
		// }
		// else{
		// 	System.out.println("String are not equal");
		// }

		// if(name1 == name2){
		// 	System.out.println("String are equal");
		// }
		// else{
		// 	System.out.println("String are not equal");
		// }

		// if(new String("Tony") == new String("Tony")){
		// 	System.out.println("String are equal");
		// }
		// else{
		// 	System.out.println("String are not equal");
		// }

		/*
		// Substring
		String sentence = "My name is Anurag";
		//substring(beg index, end index);
		String name = sentence.substring(11);
		// String name = sentence.substring(11, sentence.length());
		System.out.println(name);
		*/

		// String are Immutable.

		/*
		//String Builder
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);

		//chat at index 0
		System.out.println(sb.charAt(0));

		//set char at index 0
		sb.setCharAt(0, 'B');
		System.out.println(sb);

		// sb.insert(0, 'S');
		sb.insert(2, 'n');
		System.out.println(sb);

		// delete the extra 'n'.
		sb.delete(2,3);
		System.out.println(sb);

		sb.append(" Kapoor");
		System.out.println(sb);
		
		// =====================
		StringBuilder sb = new StringBuilder("h");
		sb.append("e"); // str = str + "e";
		sb.append("l"); // str = str + "l";
		sb.append("l");
		sb.append("o");

		System.out.println(sb);
		System.out.println(sb.length());
		//=====================s
		*/

		// reverse string.

		StringBuilder sb = new StringBuilder("hello");

		for(int i=0; i<=sb.length()/2; i++){
			int front = i;
			int back = sb.length()-1-i; // 5-1-0 => 4.

			char frontChar = sb.charAt(front);
			char backChar = sb.charAt(back);

			sb.setCharAt(front, backChar);
			sb.setCharAt(back, frontChar);
		}

		System.out.println(sb);

		/*
		//EX: get char at given index.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String str = sc.nextLine();
		System.out.print("Enter index: ");
		int index = sc.nextInt();

		System.out.println(str.charAt(index));
		*/		
	}
}
