// leetcode solution 162 java 

class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        
        // Edge case: single element
        if (n == 1) return 0;
        
        // Check if the first element is a peak
        if (nums[0] > nums[1]) return 0;
        
        // Check if the last element is a peak
        if (nums[n - 1] > nums[n - 2]) return n - 1;
        
        // Binary search on the remaining inner elements
        int low = 1;
        int high = n - 2;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // If mid is a peak
            if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            // If we are on an ascending slope, the peak must be to the right
            else if (nums[mid - 1] < nums[mid]) {
                low = mid + 1;
            }
            // If we are on a descending slope, the peak must be to the left
            else {
                high = mid - 1;
            }
        }
        
        return -1; // Dummy return
    }
}