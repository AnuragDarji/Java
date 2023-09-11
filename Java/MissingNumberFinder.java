import java.util.*;
public class MissingNumberFinder{
    public static int findMissingNumber(int[] nums){
        int n = nums.length + 1;
        int expectedSum = (n*(n+1))/2;
        
        int actualSum = 0;
        for(int num : nums){
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }
        
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: "+missingNumber);
    }
}
