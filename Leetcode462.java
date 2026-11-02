// leetcode 462 solution 
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        
        // The median is the middle element
        int median = nums[nums.length / 2];
        int ans = 0;
        for(int i =0; i<nums.length; i++){
            int diff = Math.abs(median - nums[i]);
            ans += diff;
        }
        return ans;
        
    }
}

// soumya
