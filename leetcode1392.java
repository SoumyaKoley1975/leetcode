// leetcode solution 1392 in java 

class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int index =1;
        int length =0;
        while( index <n) {
            if(s.charAt(index)==s.charAt(length)){
                length++;
                lps[index] = length;
                index++;
            }else if( length>0){
                length = lps[length-1];
            }else{
                lps[index]=0;
                index++;
            }
        }
        return s.substring(0, lps[n-1]);        
    }
}

// soumya 
