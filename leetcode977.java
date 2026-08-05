import java.util.Arrays;
import java.util.Scanner;

public class leetcode977 {
    
    // 1. Added the main method (the entry point for VS Code)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        // 3. Initialize the array dynamically based on user input
        int[] nums = new int[size];
        
        System.out.println("Enter the elements (press Enter after each): ");
        for(int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        // Square the elements
        for(int i = 0; i < size; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // Sort the array
        Arrays.sort(nums);

        // Print the output
        System.out.println("The output array: " + Arrays.toString(nums));
        
        sc.close(); // Good practice to close the scanner to prevent memory leaks
    }
}


/*
leetcode Solution 

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length; i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
*/