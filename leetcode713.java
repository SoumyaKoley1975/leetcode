// leetcode 713
// leetcode solution 

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) {
            return 0;
        }

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            long mul = 1;

            for (int j = i; j < nums.length; j++) {

                mul *= nums[j];

                if (mul >= k) {
                    break;
                }

                ans++;
            }
        }

        return ans;
    }
}