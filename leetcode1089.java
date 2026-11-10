// leetcode solution 1089 in java 

class Solution {
    public int[] NewArr(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i] == 0){
                for(int j = n-2; j>i; j--){
                    arr[j+1] = arr[j];
                }
            arr[i+1] = 0;
            i++;
            }    
        }
        return arr;
    }
    public void duplicateZeros(int[] arr) {
        NewArr(arr); 
    }
}
// soumya
