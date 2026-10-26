// leetcode solution 1725 java

class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int n = rectangles.length;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            int min = 0;
            if(rectangles[i][0]>=rectangles[i][1]){
                min = rectangles[i][1];
            }
            else{
                min = rectangles[i][0];
            }
            arr[i] = min;
        }
        Arrays.sort(arr);
        int k = arr[n-1];
        int count = 0;
        for(int i =0; i<n; i++){
            if(k == arr[i]){
                count++;
            }
        }
        return count;       
    }
}

// soumya
