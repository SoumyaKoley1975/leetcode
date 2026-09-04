// leetcode 58 solution
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        
        // Loop backwards through the string
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                // If we already found a word and hit a space, we're done
                if (length > 0) {
                    return length;
                }
            }
        }
        
        return length;
    }
}
