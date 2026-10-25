// leetcode solution 1550
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        if(n<3){
            return false;
        }
        for(int i = 0; i<n; i++){
            if(arr[i]%2 == 1){
                arr[i] = 1;
            }
            else{
                arr[i] = 0;
            }
        }
        if(n==3){
            int sum = arr[0] + arr[1] + arr[2];
            if(sum==3){
                return true;
            }
            else{
                return false;
            }
        }
        int count = 0;
        for(int i = 0; i<(n-1); i++){
            if(arr[i]==1){
            if(arr[i] == arr[i+1]){
                count++;
            }
            else{
                count = 0;
            }
            if(count >= 2){
                return true;
            }}
        }
        return false;
        
    }
}
// soumya
