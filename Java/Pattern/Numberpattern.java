import java.util.*;

public class Numberpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();

        /*
         * 1
         * 12
         * 123
         * 1234
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // value are change in row -> print (j)
            }
            System.out.println();
        }

        /*
         * 1
         * 22
         * 333
         * 4444
         */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i); // value are not change in row -> print (i)
            }
            System.out.println();
        }

        /*
         * 5
         * 54
         * 543
         * 5432
         * 54321
         */

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        /*
         * 54321
         * 5432
         * 543
         * 54
         * 5
         */

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        /*
         * 5
         * 45
         * 345
         * 2345
         * 12345
         */

        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        /*
         * 54321
         * 4321
         * 321
         * 21
         * 1
         */

        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
