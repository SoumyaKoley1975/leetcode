// leetcode solution 4102 in java

class Solution {
    public long countValidSubstrings(String s) {
        long validCount = 0;
        int lastAbcStartIndex = -1;
        for(int i =0; i< s.length(); i++){
            if(i>=2 && s.charAt(i-2) == 'a' && s.charAt(i-1) == 'b' && s.charAt(i) == 'c'){
                lastAbcStartIndex = i-2;
            }
            validCount += (i-lastAbcStartIndex);
            
        }
        return validCount;
        
    }
}
// soumya
