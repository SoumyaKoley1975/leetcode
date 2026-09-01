// leetcode 2578 solution 

class Solution {
    public int splitNum(int num) {
        // Convert the integer to a character array of digits
        char[] digits = String.valueOf(num).toCharArray();
        
        // Sort the digits in ascending order
        java.util.Arrays.sort(digits);
        
        // Initialize num1 and num2
        int num1 = 0;
        int num2 = 0;
        
        // Distribute digits alternately to num1 and num2
        for (int i = 0; i < digits.length; i++) {
            if (i % 2 == 0) {
                num1 = num1 * 10 + (digits[i] - '0');
            } else {
                num2 = num2 * 10 + (digits[i] - '0');
            }
        }
        
        // Return the minimum possible sum
        return num1 + num2;
    }
}
