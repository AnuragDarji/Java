import java.util.*;

class Swaptwonumber{
	public static void main(String[] args) {
		// Before Swaping...
		System.out.println("===== Before Swaping ======");

		Scanner obj1 = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first = obj1.nextInt();

		Scanner obj2 = new Scanner(System.in);
		System.out.print("Enter second number: ");
		int second = obj2.nextInt();

		//After swaping...

		System.out.println("\n===== After Swaping ======");

		int temp = first;
		first = second;
		second = temp;

		System.out.println("First number: "+first);
		System.out.println("Second number: "+second);
	}
}