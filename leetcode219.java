// leetcode solution 219

import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Map to store: Key = number, Value = its latest index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If we've seen this number before, check the distance
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true; // Found a duplicate within distance k
                }
            }
            // Update the map with the current index (always keeps the closest one)
            map.put(nums[i], i);
        }
        
        return false;
    }
}
