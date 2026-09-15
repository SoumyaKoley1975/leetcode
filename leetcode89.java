// leetcode 89 solution 

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        // Total numbers in an n-bit gray code sequence is 2^n
        int totalNumbers = 1 << n; 
        
        for (int i = 0; i < totalNumbers; i++) {
            // Apply the direct binary-to-gray conversion formula
            result.add(i ^ (i >> 1));
        }
        
        return result;
    }
}
