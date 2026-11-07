// leetcode solution in java 4104

class Solution {
    public long countValidSubstrings(String s) {
        long validCount =0;
        int lastA = -1;
        int lastAB = -1;
        int lastABC =-1;
        for(int i =0; i <s.length(); i++){
            char ch = s.charAt(i);
            if (ch == 'a'){
                lastA = i;
                
            }
            else if(ch == 'b'){
                lastAB = Math.max(lastAB, lastA);
            }
            else if(ch == 'c'){
                lastABC = Math.max(lastABC, lastAB);
            }
            validCount += (i - lastABC);
        }
        return validCount;
        
    }
}

// soumya
