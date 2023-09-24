import java.util.*;

public class Array {
    static int findTarget(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Enter value inside array
        for(int i=0; i<arr.length;i++){
           arr[i] = sc.nextInt();
        }

        // Show array
        System.out.print("Created Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        // Element target
        System.out.println();
        System.out.print("target value: ");
        int target = sc.nextInt();

        int result = findTarget(arr, target);

        if(result != -1){
            System.out.println("Element find at index "+result);
        }
        else{
            System.out.println("Element not find at any index");
        }

    }
}
