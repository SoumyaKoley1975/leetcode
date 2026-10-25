/* time limit exceed 
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int n = arr.length;
        if(n==0){
            return arr;
        }
        int[] num = new int[n];
        int[] ans = new int[n];
        int[] finalAns = new int[n];
        for(int i = 0; i<n; i++){
            num[i] = arr[i];
        }
        Arrays.sort(num);
        int k =1;
        ans[0] = k;
        for(int i = 0; i<n-1; i++){
            
            if(num[i] != num[i+1]){
                ans[i+1] = k+1;
                k++;
            }
            else{
                ans[i] = k;
            }
        }

        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                if(arr[i] == num[j]){
                    finalAns[i] = ans[j];
                    break;
                }
            }
        }
        return finalAns;        
    }
}
*/

// leetcode solution in java using hashmap problem no 1331


import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // Step 1: Clone the array and sort it
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        
        // Step 2: Store unique elements and their ranks in a HashMap
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sorted) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }
        
        // Step 3: Replace each element in the original array with its rank
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rankMap.get(arr[i]);
        }
        
        return arr;
    }
}
// soumya
