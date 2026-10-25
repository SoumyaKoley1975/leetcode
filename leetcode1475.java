// leetcode solution 1475 in java
class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        for(int i =0; i<n-1; i++){
            int j = i+1;
            while(j<n){
                if(prices[i]>=prices[j]){
                    ans[i] = prices[i]-prices[j];
                    break;
                }
                else{
                    ans[i] = prices[i];
                }
                j++;
            }
        }
        ans[n-1] = prices[n-1];
        return ans;     
        
    }
}
//soumya
