// leetcode solution 3364 in java 

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
        
        // i represents the length of the subarray
        for (int i = l; i < r + 1; i++) {
            // j represents the starting index of the subarray
            for (int j = 0; j <= nums.size() - i; j++) { 
                int sum = 0;
                
                // z represents the offset from the starting index j
                for (int z = 0; z < i; z++) {
                    sum += nums.get(j + z); // Fix 1: Add j to z
                }
                
                // Fix 3: Only consider strictly positive sums
                if (sum > 0 && sum < min) {
                    min = sum;
                }
            }
        }
        
        // Fix 4: Check if min was actually updated
        if (min != Integer.MAX_VALUE) {
            return min;
        }
        return -1;
    }
}

// soumya 
