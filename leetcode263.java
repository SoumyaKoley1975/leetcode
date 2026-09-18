// leetcode solution 263 

class Solution {
    public boolean isUgly(int n) {
        // Ugly numbers must be positive integers
        if (n <= 0) {
            return false;
        }
        
        // Divide by 2, 3, and 5 as much as possible
        int[] divisors = {2, 3, 5};
        for (int factor : divisors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        
        // If it reduces to 1, it's an ugly number
        return n == 1;
    }
}
