// leetcode solution 115 
class Solution {
    public int numDistinct(String s, String t) {
        int n = t.length();
        int[] dp = new int[n + 1];
        
        // Base case: There is 1 way to match an empty target string t
        dp[0] = 1; 
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            // Traverse backwards to avoid overwriting values needed for the current row
            for (int j = n; j >= 1; j--) {
                if (sChar == t.charAt(j - 1)) {
                    dp[j] += dp[j - 1];
                }
            }
        }
        
        return dp[n];
    }
}
// soumya