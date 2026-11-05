// leetcode 575 in java

class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Arrays.sort(candyType);
        int type = 1;
        for(int i =1; i<n; i++){
            if(candyType[i-1] != candyType[i]){
                type++;
            }
        }
        int ans = n/2;
        if(type<ans){
            return type;
        }
        else{
            return ans;
        }
        
    }
}
// soumya
