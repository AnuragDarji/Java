
public class Match {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,6,5,7,7};

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
