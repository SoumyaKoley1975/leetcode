// leetcode solution 453 in java 

class Solution {
    public int minMoves(int[] nums) {
        int lo = Arrays.stream(nums).min().getAsInt(), moves = 0;
        for (int x : nums) moves += x - lo;
        return moves;
    }
}

// soumya 
