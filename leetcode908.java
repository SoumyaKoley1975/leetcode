// leetcode solution 908 in java

class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        
        // Step 1: Find the actual minimum and maximum in the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        
        // Step 2: Calculate the new difference
        int difference = (max - k) - (min + k);
        
        // Step 3: If the difference is negative, it means we can make all elements equal (score 0)
        return Math.max(0, difference);
    }
}

// soumya
