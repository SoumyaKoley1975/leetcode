// leetcode 1295 in java

class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int i =0; i<nums.length; i++){
            int length = String.valueOf(Math.abs(nums[i])).length();
            if(length % 2 == 0){
                ans++;
            }
        }
        return ans;
        
    }
}
// soumya
