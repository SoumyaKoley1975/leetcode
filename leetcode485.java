// leetcode 485 solution in java 

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =1;
        int val = 0;
        if(nums.length == 1){
            if(nums[0] == 1){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(nums.length == 2){
            int add = nums[0] + nums[1];
            return add;
        }
        if(nums.length == 3){
            int add = nums[0] + nums[1] + nums[2];
            if(add == 2){
                if(nums[1]== 0){
                    return 1;
                }
            }
            else{
                return add;
            }
        }      
        for(int i =0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1] && nums[i] == 1){
                count++;
                val = Math.max(count,val);
            }else{
                count = 1;
            }
        }
        return val;
    }
}

// soumya
