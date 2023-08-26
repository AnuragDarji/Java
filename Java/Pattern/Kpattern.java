import java.util.*;

public class Kpattern{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num: ");
		int n = sc.nextInt();

		for(int i=n; i>=1; i--){

			for(int j=1; j<=i; j++){
				if(j==1 || j==i){
					System.out.print("*");
				} else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}


		for(int i=2; i<=n; i++){
			for(int j=1; j<=i; j++){
				if(j==1 || j==i){
					System.out.print("*");
				} else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

// ============== 2nd Way ================

// import java.util.*;

// public class Main{
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter num: ");
// 		int n = sc.nextInt();

// 		for(int i=n; i>=2; i--){
// 			for(int j=1; j<=1; j++){
// 				System.out.print("*");
// 			}
// 			for(int j=2; j<=i-1; j++){
// 				System.out.print(" ");
// 			}
// 			for(int j=n;j<=n;j++){
// 				System.out.print("*");
// 			}
// 			System.out.println();
// 		}

// 		System.out.println("*");

// 		for(int i=2; i<=n; i++){
// 			for(int j=1; j<=1; j++){
// 				System.out.print("*");
// 			}
// 			for(int j=2; j<=i-1; j++){
// 				System.out.print(" ");
// 			}
// 			for(int j=n;j<=n;j++){
// 				System.out.print("*");
// 			}
// 			System.out.println();
// 		}
// 	}
// }
