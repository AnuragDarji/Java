import java.util.*;

public class Factorial {
    static long factorial(long n){
        if(n==1){
            return 1;
        }
        else{
            return(n*factorial(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        long n = sc.nextLong();

        System.out.println("Factorial is: "+factorial(n));
    }
}
