// leetcode solution 402

import java.util.Stack;

public class Solution {
    public String removeKdigits(String num, int k) {
        // Base case: If we need to remove all digits, the result is "0"
        if (num.length() == k) {
            return "0";
        }
        
        // Use a stack to hold the digits of the smallest number
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < num.length(); i++) {
            char currentDigit = num.charAt(i);
            
            // While we still have digits to remove (k > 0)
            // and the stack is not empty, and the top of the stack 
            // is greater than the current digit, pop the stack.
            while (k > 0 && !stack.isEmpty() && stack.peek() > currentDigit) {
                stack.pop();
                k--;
            }
            stack.push(currentDigit);
        }
        
        // Edge Case 1: If digits are in non-decreasing order (e.g., "1234") and k > 0,
        // we remove digits from the end (the largest digits).
        while (k > 0) {
            stack.pop();
            k--;
        }
        
        // Construct the string from the stack
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse(); // Reverse because stack outputs in reverse order
        
        // Edge Case 2: Remove leading zeros
        int nonZeroIndex = 0;
        while (nonZeroIndex < sb.length() && sb.charAt(nonZeroIndex) == '0') {
            nonZeroIndex++;
        }
        
        // If everything was zeros, return "0"
        if (nonZeroIndex == sb.length()) {
            return "0";
        }
        
        return sb.substring(nonZeroIndex);
    }
}
