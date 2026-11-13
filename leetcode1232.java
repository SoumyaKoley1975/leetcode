// leetcode solution 1232 in java 

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int len = coordinates.length;
        if(len <= 2){
            return true;
        }
        int m = coordinates[1][0] - coordinates[0][0];
        int n = coordinates[1][1] - coordinates[0][1];
        for(int i = 2; i<len; i++){
            if((coordinates[i][1] - coordinates[1][1])*m != (coordinates[i][0] - coordinates[1][0])*n){
                return false;
            }
            
        }
        return true;
        
    }
}

// soumya
