// leetcode solution leetcode 1539 solution in java
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num = 0;
        int t = 0;
        for(int i = 0; i<arr.length; i++){
            while(num<arr[i]){
                num++;
                if(num != arr[i]){
                    t++;
                }
                if(t == k){
                    return num;
                }
            }            
        }
        int diff = 0;
        if(t<k){
            diff = k-t;            
        }
        return num + diff;
    }
}
// soumya
