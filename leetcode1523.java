// leetcode solution 1523 in java 

class Solution {
    public int countOdds(int low, int high) {
        if(low%2 == 1&& high %2==1){
            return 1+((high/2)-(low/2));            
        }
        else{
            if(low%2==0 && high % 2 ==1){
                return 1+((high/2)-(low/2));
            }
        }
        return ((high/2)-(low/2));     
    }
}

// soumya
