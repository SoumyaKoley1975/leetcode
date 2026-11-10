// leetcode solution in java problem no 999 

class Solution {
    public int numRookCaptures(char[][] board) {
        int n = board.length;
        int a=0;
        int b=0;
        int count=0;
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                if(board[i][j] == 'R'){
                    a=i;
                    b=j;
                    break;
                }
                

            }
        }
        for(int i = b;i<n;i++){
            if(board[a][i]=='p'){
                count++;
                break;
            }
            else if(board[a][i]=='B'){
                break;
            }
        }
        for(int i = b;i>=0;i--){
            if(board[a][i]=='p'){
                count++;
                break;
            }
            else if(board[a][i]=='B'){
                break;
            }
        }
        for(int i = a;i<n;i++){
            if(board[i][b]=='p'){
                count++;
                break;
            }
            else if(board[i][b]=='B'){
                break;
            }
        }
        for(int i = a;i>=0;i--){
            if(board[i][b]=='p'){
                count++;
                break;
            }
            else if(board[i][b]=='B'){
                break;
            }
        }
        return count;      
    }
}

// soumya
