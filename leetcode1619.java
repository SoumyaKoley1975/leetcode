// leetcode 1619 solution 
//import java.util.Arrays;

class Solution {
    public double trimMean(int[] arr) {
        // 1. Sort the array so smallest elements are first, largest are last
        Arrays.sort(arr);
        
        int n = arr.length;
        
        // 2. Calculate exactly 5% of the total array length
        int removeCount = n / 20; 
        
        double sum = 0;
        
        // 3. Sum only the elements between the 5% mark and the 95% mark
        for (int i = removeCount; i < n - removeCount; i++) {
            sum += arr[i];
        }
        
        // 4. Calculate the trimmed mean using the remaining 90% of elements
        int remainingElementsCount = n - (2 * removeCount);
        return sum / remainingElementsCount;
    }
}
