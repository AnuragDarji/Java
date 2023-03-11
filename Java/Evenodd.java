import java.util.*;

class Evenodd{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = myObj.nextInt();

		if(num%2==0)
			System.out.println(num+" is even");
		else
			System.out.println(num+" is odd");

	}
}