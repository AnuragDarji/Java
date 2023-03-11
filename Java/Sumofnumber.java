import java.util.Scanner;

class Sumofnumber{
	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in); // create object
	    System.out.print("Enter First number: ");
		int first = obj1.nextInt(); // read user input.

		Scanner obj2 = new Scanner(System.in);
		System.out.print("Enter second number: ");
		int second = obj2.nextInt();

		// sum of two numbers...
		int sum = first + second;
		System.out.println("sum is: "+sum);
	}
}