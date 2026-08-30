// leetcode 2091 solution 

class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;
        
        int minIndex = 0;
        int maxIndex = 0;
        
        // Find the indices of the minimum and maximum elements
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        
        // Identify which index comes first
        int i = Math.min(minIndex, maxIndex);
        int j = Math.max(minIndex, maxIndex);
        
        // Strategy 1: Remove everything from the front
        int front = j + 1;
        
        // Strategy 2: Remove everything from the back
        int back = n - i;
        
        // Strategy 3: Remove the first element from the front and the second from the back
        int both = (i + 1) + (n - j);
        
        // Return the minimum of the three strategies
        return Math.min(Math.min(front, back), both);
    }
}