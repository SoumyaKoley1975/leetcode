// leetcode solution 1122 in java 

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr = new int[n1];
        int c =0;
        for(int i =0; i<n2; i++){
            for(int j =0; j<n1; j++){
                if(arr2[i]==arr1[j]){
                    arr[c] = arr2[i];
                    c++;
                    arr1[j] = -1;
                }
            }
        }
        Arrays.sort(arr1);
        for(int j =0; j<n1; j++){
            if(arr1[j]!=-1){
                arr[j] = arr1[j];
            }
        }
        return arr;        
    }
}
// soumya
