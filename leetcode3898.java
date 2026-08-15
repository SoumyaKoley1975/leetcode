// leetcode solution 3898
class Solution {
    public int[] findDegrees(int[][] matrix) {
        int totalRow = matrix.length;
        int[] ans = new int[totalRow];

        for(int i= 0;i<totalRow;i++){
            for(int j=0;j<totalRow;j++){
                ans[i] += matrix[i][j];
            }
        }
        return ans;
       
    }
}