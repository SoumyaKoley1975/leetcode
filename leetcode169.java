// leetcode solution 169 in java

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];       
    }
}

// soumya
