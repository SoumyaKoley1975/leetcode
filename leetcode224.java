// leetcode solution 224

class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentResult = 0;
        int number = 0;
        int sign = 1; // 1 means positive, -1 means negative

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                // Build the full number (can be multi-digit)
                number = number * 10 + (c - '0');
            } else if (c == '+') {
                currentResult += sign * number;
                number = 0;
                sign = 1;
            } else if (c == '-') {
                currentResult += sign * number;
                number = 0;
                sign = -1;
            } else if (c == '(') {
                // Push current result and current sign onto the stack
                stack.push(currentResult);
                stack.push(sign);
                // Reset for the new sub-expression
                currentResult = 0;
                sign = 1;
            } else if (c == ')') {
                currentResult += sign * number;
                number = 0;
                // Multiply by the sign before the parenthesis
                currentResult *= stack.pop();
                // Add the result from before the parenthesis
                currentResult += stack.pop();
            }
        }

        // Add the last number if any
        currentResult += sign * number;
        return currentResult;
    }
}


// soumya
