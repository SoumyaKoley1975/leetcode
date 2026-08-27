// leetcode 1572 java 

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        if (mat.length == 1){
            sum = mat[0][0];
            return sum;
        }
        for(int i =0; i<mat.length ; i++){
            sum += mat[i][i];           
        }
        for(int j =mat.length-1; j>-1 ; j--){
            sum += mat[mat.length-1-j][j];
        }
        if(mat.length%2 == 1){
            sum = sum - mat[mat.length/2][mat.length/2];
        }
        return sum ;

        
    }
}