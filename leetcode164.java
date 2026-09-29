// leetcode solution 148

import java.util.Arrays;

class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0;
        }
        
        // 1. Sort the array first
        Arrays.sort(nums);
        
        int maxGap = 0; 
        
        // 2. Single loop to find the max difference between adjacent elements
        for (int i = 0; i < n - 1; i++) {
            int gap = nums[i + 1] - nums[i]; // No need for Math.abs since it's sorted
            if (gap > maxGap) {
                maxGap = gap;
            }
        }
        
        return maxGap;
    }
}
