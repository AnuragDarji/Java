public class Prime {
    static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2; i<=n/2; i++){
            if(n%2 == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 7;
        
        if(isPrime(n)){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}
