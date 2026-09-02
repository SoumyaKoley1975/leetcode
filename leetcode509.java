// leetcode 509 solution

import java.util.Arrays;

class Solution {
    // 1. Declare the memo array at the class level so both methods can see it
    private int[] memo;

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        if (memo[n] != -1) {
            return memo[n];
        }
        
        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // 2. Initialize and fill the array ONCE here before starting recursion
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        
        // 3. Corrected typo from 'fabonacci' to 'fibonacci'
        return fibonacci(n);
    }
}
