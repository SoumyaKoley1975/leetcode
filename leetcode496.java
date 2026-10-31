// leetcode solution 496 in java 

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];
        for(int i =0; i<n; i++){
            if(nums1[i] == nums2[m-1]){
                ans[i] = -1;
                continue;
            }
            for(int j = 0; j<m-1; j++){
                if(nums1[i]==nums2[j]){
                    for(int k =j; k<m;k++){
                        if(nums2[j]<nums2[k]){
                            ans[i] = nums2[k];
                            break;
                        }
                        else{
                        ans[i] = -1;
                        }
                    }
                }
            }
            
        }
        return ans;
        
        
    }
}

// soumya
