// leetcode 2154.java
class Solution {
    public int findFinalValue(int[] nums, int original) {

        Arrays.sort(nums);
        int i = 0;
        int mul = 1;
        while(i < nums.length){
            if(nums[i] == original*mul){
                mul *= 2;
            }
            i++;
        }
        int m = original*mul;
        return m;
        
    }
}
// soumya
