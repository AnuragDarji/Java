public class FibonacciRecursion {
    static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci series: ");
        for(int i=0; i<n; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}
