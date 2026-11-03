// leetcode solution 2239 in java

class Solution {
    public int findClosestNumber(int[] nums) {
        // Assume the first number is the closest to start
        int closest = nums[0]; 
        
        for (int i = 1; i < nums.length; i++) {
            int currentDistance = Math.abs(nums[i]);
            int closestDistance = Math.abs(closest);
            
            // If we find a number strictly closer to 0, update closest
            if (currentDistance < closestDistance) {
                closest = nums[i];
            } 
            // If distances are equal, pick the larger value (as per the problem statement)
            else if (currentDistance == closestDistance && nums[i] > closest) {
                closest = nums[i];
            }
        }
        
        return closest;
    }
}

// soumya
