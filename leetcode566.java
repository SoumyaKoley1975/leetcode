// leetcode soluytion 566 in java 

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] reshape = new int[r][c];
        if(m*n == r*c){
            for(int i = 0; i<n; i++){
                for(int j =0 ; j<m; j++){
                    // Find the 1-dimensional index of the current element
                    int index = i * m + j;
                    
                    // Map it to the new r x c matrix
                    reshape[index / c][index % c] = mat[i][j];
                }
            }
            return reshape;
        }
        return mat;  
    }
}

// soumya
