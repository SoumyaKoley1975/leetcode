// leetcode  solution 357  

class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        // Base case for n = 0
        if (n == 0) {
            return 1;
        }
        
        int totalCount = 10; // Base count for 1-digit numbers (0-9)
        int currentUniqueChoices = 9;
        int availableDigits = 9;
        
        // Calculate permutations for numbers with length 2 up to n
        for (int i = 2; i <= n; i++) {
            currentUniqueChoices = currentUniqueChoices * availableDigits;
            totalCount += currentUniqueChoices;
            availableDigits--; // One less choice for the next position
        }
        
        return totalCount;
    }
}
