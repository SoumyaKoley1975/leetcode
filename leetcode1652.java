// leetcode 1652 solution 

class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        int[] arr = new int[3*n];
        for(int i = 0; i<n; i++){
            arr[i] = code[i];
            arr[i+n] = code[i];
            arr[i+2*n] = code[i];
        }

        if(k == 0){
            for(int i = 0; i<n; i++){
                ans[i] = 0;
            }
        }
        else if(k > 0){
            for(int i = 0; i<n; i++){
                int sum = 0;
                int c = 0;
                while(c < k){
                    sum += arr[i+1+c];
                    c++;
                }
                ans[i] = sum;
            }
        }
        else{
            for(int i = n; i<2*n; i++){
                int sum = 0;
                int c = 0;
                int m = -k;
                while(c < m){
                    sum += arr[i-1-c];
                    c++;
                }
                ans[i-n] = sum;
            }

        }
        return ans;
        
    }
}

//soumya
