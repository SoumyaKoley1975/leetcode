// leetcode solution 400

class Solution {
    public int findNthDigit(int n) {
        int length = 1;
        long count = 9;
        long start = 1;

        // Step 1: Find the length of the number that contains the nth digit
        while (n > length * count) {
            n -= length * count;
            length++;
            count *= 10;
            start *= 10;
        }

        // Step 2: Find the actual number containing the nth digit
        start += (n - 1) / length;

        // Step 3: Find the specific digit within that number
        String s = Long.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % length));
    }
}
// soumya 
