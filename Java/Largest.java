import java.util.*;

class Largest{
	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = obj1.nextInt();

		Scanner obj2 = new Scanner(System.in);
		System.out.print("Enter second number: ");
		int n2 = obj2.nextInt();

		Scanner obj3 = new Scanner(System.in);
		System.out.print("Enter third number: ");
		int n3 = obj3.nextInt();

		if (n1>=n2 && n1>=n3)
			System.out.print(n1+" is a largest number.");
		else if (n2>=n1 && n2>=n3)
			System.out.print(n2+" is a largest number.");
		else
			System.out.print(n3+" is a largest number.");
	}
}