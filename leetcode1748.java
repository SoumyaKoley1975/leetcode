// leetcode solution 1748 java

class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            if(( i== 0 || nums[i] != nums[i-1]) && (i == nums.length-1 || nums[i] != nums[i+1])){
                sum += nums[i];
            }
        }
        return sum;
        
    }
}

// soumya
