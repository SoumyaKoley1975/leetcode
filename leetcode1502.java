// leetcode Solution 1502
// can you make a AM progression
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff1 = arr[1]-arr[0];
        int c =0;
        for (int i =0;i<arr.length-1;i++){
            int diff2 = arr[i+1]-arr[i];

            if(diff1!=diff2){
                c++;               
            }           
        }
        if(c==0){
            return true;
        }
        else 
         return false;
        
    }
    
}

