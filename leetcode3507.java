// leetcode solution 3507

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int minimumPairRemoval(int[] nums) {
        // Convert the primitive array to a List for easy manipulation
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        
        int operations = 0;
        
        // Repeatedly apply the operation until the list is non-decreasing
        while (!isNonDecreasing(list)) {
            int minSum = Integer.MAX_VALUE;
            int minIdx = -1;
            
            // Look for the adjacent pair with the lowest sum
            for (int i = 0; i < list.size() - 1; i++) {
                int currentSum = list.get(i) + list.get(i + 1);
                // Strict less-than handles the 'leftmost' rule for ties automatically
                if (currentSum < minSum) {
                    minSum = currentSum;
                    minIdx = i;
                }
            }
            
            // Replace the pair with their combined sum
            list.set(minIdx, minSum);
            list.remove(minIdx + 1);
            operations++;
        }
        
        return operations;
    }
    
    // Check if the list is sorted in non-decreasing order
    private boolean isNonDecreasing(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
