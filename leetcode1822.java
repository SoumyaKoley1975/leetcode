// leetcode solution 1822 java 

class Solution {
    public int arraySign(int[] nums) {
        int nCount = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                return 0;
            }
            if(nums[i] < 0){
                nCount++;
            }
        }
        if(nCount % 2 == 0){
            return 1;
        }
        return -1;       
    }
}

// soumya
