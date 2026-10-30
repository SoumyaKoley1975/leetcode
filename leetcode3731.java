// leetcode solution 3731 in java 

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int m =0;
        for(int i =nums[0]; i< nums[nums.length-1]; i++){
            if(i != nums[m]){
                ans.add(i);
            }
            else{
                m++;
            }
        }
        return ans;
        
    }
}

// soumya
