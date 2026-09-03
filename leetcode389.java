// leetcoide 389 solution

class Solution {
    public char findTheDifference(String s, String t) {
        int charSum = 0;
        
        // Add characters from t
        for (int i = 0; i < t.length(); i++) {
            charSum += t.charAt(i);
        }
        
        // Subtract characters from s
        for (int i = 0; i < s.length(); i++) {
            charSum -= s.charAt(i);
        }
        
        return (char) charSum;
    }
}
