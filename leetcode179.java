// leetcode solution 179

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String largestNumber(int[] nums) {
        // 1. Convert the integer array to a string array
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // 2. Sort the strings using a custom comparator
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare concatenated results in reverse order (b+a vs a+b)
                // to sort from largest to smallest
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); 
            }
        });

        // 3. Handle the edge case where the largest number is "0"
        // (e.g., input is [0, 0, 0], we should return "0", not "000")
        if (strNums[0].equals("0")) {
            return "0";
        }

        // 4. Build the final large number string
        StringBuilder largestNum = new StringBuilder();
        for (String str : strNums) {
            largestNum.append(str);
        }

        return largestNum.toString();
    }
}
