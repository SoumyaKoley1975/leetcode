// leetcode 1137 in java 

class Solution {
    
    public int tribonacci(int n) {
        if (n <= 1) return n;
        
        int first = 0, second = 1, third = 1;
        for (int i = 3; i <= n; i++) {
            int next = first + second + third;
            first = second;
            second = third;
            third = next;
        }
        return third;        
    }
}

// soumya
