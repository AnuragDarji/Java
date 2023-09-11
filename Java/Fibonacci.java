import java.util.*;

class Fibonacci{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter legth of series: ");
        int n = sc.nextInt();
        
        if(n <= 1){
            System.out.print(n);
        }
        
        int fib1 = 0;
        int fib2 = 1;
        int fib = 0;
        System.out.print("Fibonacci series: ");
        for(int i=1; i<=n; i++){
            System.out.print(fib1+" ");
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
    }
}
