// leetcode 1207 solution 
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Shift range [-1000, 1000] to [0, 2000] by adding an offset of 1000
        int[] freq = new int[2001];
        for (int num : arr) {
            freq[num + 1000]++;
        }
        
        // Track which frequencies we have already seen
        // Maximum possible frequency is the max array length (1000)
        boolean[] seenFreq = new boolean[1001];
        
        for (int count : freq) {
            if (count > 0) {
                // If we've already seen this frequency, it's not unique
                if (seenFreq[count]) {
                    return false;
                }
                seenFreq[count] = true;
            }
        }
        
        return true;
    }
}
