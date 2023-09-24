public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3,6};
        
        for(int i=1; i<arr.length; i++){
            int n = i;

            while(n>0 && arr[n-1] > arr[n]){
                int t = arr[n];
                arr[n] = arr[n-1];
                arr[n-1] = t;
                n--;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
