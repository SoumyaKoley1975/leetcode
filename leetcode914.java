// leetcode solution 214 in java


class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        // Since deck[i] is between 0 and 9999 based on constraints, 
        // we can use a fixed-size array to count frequencies.
        int[] count = new int[10000];
        
        for (int card : deck) {
            count[card]++;
        }
        
        int currentGcd = 0;
        
        for (int freq : count) {
            if (freq > 0) {
                // Calculate GCD of the current frequency and the overall GCD
                currentGcd = gcd(currentGcd, freq);
            }
        }
        
        // If the greatest common divisor is at least 2, a valid partition exists
        return currentGcd >= 2;
    }
    
    // Helper method to find the Greatest Common Divisor using Euclidean algorithm
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}


// soumya
