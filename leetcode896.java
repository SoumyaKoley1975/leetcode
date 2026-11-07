// leetcode 896 solution in java

class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        int count1 =0;
        int count2 =0;
        if(n<=2){
            return true;
        }
        for(int i = 0; i<n-1; i++){
            if(nums[i] >= nums[i+1]){
                count1++;
            }
        }
        for(int i = 0; i<n-1; i++){
            if(nums[i] <= nums[i+1]){
                count2++;
            }
        }
        if(count1 == n-1 || count2 == n-1){
            return true;
        }
        return false;
        
    }
}

// soumya
