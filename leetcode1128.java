// leetcode solution 1128 in java 

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        // Array to store the frequency of each normalized domino (from 11 to 99)
        int[] counts = new int[100]; 
        int totalPairs = 0;
        
        for (int[] domino : dominoes) {
            // Create a unique 2-digit number for the domino
            int min = Math.min(domino[0], domino[1]);
            int max = Math.max(domino[0], domino[1]);
            int number = min * 10 + max;
            
            // Add the number of times we've seen this domino before to our answer
            totalPairs += counts[number];
            
            // Increment the count for this domino
            counts[number]++;
        }
        
        return totalPairs;
    }
}

// soumya
