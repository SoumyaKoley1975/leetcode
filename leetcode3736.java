// leetcode solution 3736 in java 

class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return 0;
        }
        Arrays.sort(nums);
        int max = nums[n-1];
        int sum =0;
        for(int i = 0; i<n; i++){
            sum += nums[i];            
        }
        int ans = nums[n-1]*n - sum;
        return ans;        
    }
}
// soumya
