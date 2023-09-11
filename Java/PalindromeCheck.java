// Java program to check whether a
// string is a Palindrome
// Using two pointing variables

import java.util.*;
// Main class
public class PalindromeCheck {

	// Method
	// Returning true if string is palindrome
	static boolean isPalindrome(String str)
	{

		// Pointers pointing to the beginning
		// and the end of the string
		int i = 0, j = str.length() - 1;

		// While there are characters to compare
		while (i < j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;

			// Increment first pointer and
			// decrement the other
			i++;
			j--;
		}
		// Given string is a palindrome
		return true;
	}

	public static void main(String[] args)
	{
		// Input string
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.next();

		// Convert the string to lowercase
		str = str.toLowerCase();
		// passing bool function till holding true
		if (isPalindrome(str))
			System.out.println("The string is a palindrome.");
		else
			System.out.println("The string is not a palindrome.");
	}
}
