class Solution {
    public int countNegatives(int[][] grid) {
        // get the number of the rows
        int r = grid.length;
        // get the number of coloumns
        int c = grid[0].length;

        // take count of negative number 

        int count = 0;

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(grid[i][j]<0){
                    count++;
                }
            }

        }
        return count;
    }
}
// soumya
