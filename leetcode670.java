// leetcode 670 solution 


class Solution {
    public int maximumSwap(int num) {
        // Convert the number to a character array for easy swapping
        char[] digits = Integer.toString(num).toCharArray();
        
        // Array to store the last occurring index of each digit (0-9)
        int[] lastPos = new int[10];
        for (int i = 0; i < digits.length; i++) {
            lastPos[digits[i] - '0'] = i;
        }
        
        // Scan the number from left to right
        for (int i = 0; i < digits.length; i++) {
            int currentDigit = digits[i] - '0';
            
            // Check if there's a larger digit appearing later
            for (int d = 9; d > currentDigit; d--) {
                if (lastPos[d] > i) {
                    // Swap the digits
                    char temp = digits[i];
                    digits[i] = digits[lastPos[d]];
                    digits[lastPos[d]] = temp;
                    
                    // Convert back to integer and return immediately
                    return Integer.parseInt(new String(digits));
                }
            }
        }
        
        // If no swap can improve the number, return the original
        return num;
    }
}
