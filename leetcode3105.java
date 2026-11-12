// leetcode solution 3105 in java

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        // Base case for empty arrays (though constraints say length >= 1)
        if (nums.length == 0) return 0;
        
        int maxLength = 1;
        int incCount = 1;
        int decCount = 1;
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                incCount++;
                decCount = 1; // reset decreasing count
            } else if (nums[i] > nums[i + 1]) {
                decCount++;
                incCount = 1; // reset increasing count
            } else {
                // If numbers are equal, reset both
                incCount = 1;
                decCount = 1;
            }
            
            // Update the maximum length at every step
            maxLength = Math.max(maxLength, Math.max(incCount, decCount));
        }
        
        return maxLength;
    }
}

// soumya
