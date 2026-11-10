// leetcode solution 2748 in java 

class Solution {
    public int countBeautifulPairs(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int a=0;
            while(nums[i]>0){
                a=nums[i]%10;
                nums[i]/=10;
            }
            for(int j=i+1;j<nums.length;j++){
                int b=nums[j]%10;
                int min=Math.min(a,b);
                boolean flag=true;
                for(int k=2;k<=min;k++){
                    if(a%k==0 && b%k==0){
                        flag=false;
                        break;
                    }
                }
                if(flag) ans++;
            }
        }
        return ans;
    }
}

// soumya 
