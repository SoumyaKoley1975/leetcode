// leetcode 2161

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int smallCount = 0;
        int equal = 0;
        int greatCount = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<pivot){
                smallCount++;
            }
            else if(nums[i]==pivot){
                equal++;
            }
            else{
                greatCount++;
            }
        }
        int[] ans = new int[nums.length];
        int c1 =0;
        int c2 = smallCount;
        int c3 =smallCount+equal;

        for(int i =0;i<nums.length;i++){
            if(nums[i]<pivot){
                ans[c1]=nums[i];
                c1++;
            }
            else if(nums[i]>pivot){
                ans[c3]=nums[i];
                c3++;
            }
            else{
                ans[c2]=pivot;
                c2++;
            }
        }
        return ans;        
    }
}