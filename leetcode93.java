import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        // An IP address has 4 segments, each max 3 digits. 
        // If the string length is less than 4 or greater than 12, it's impossible.
        if (s == null || s.length() < 4 || s.length() > 12) {
            return result;
        }
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int startIndex, List<String> currentSegments, List<String> result) {
        // Base case: If we have found 4 segments and reached the end of the string
        if (currentSegments.size() == 4) {
            if (startIndex == s.length()) {
                result.add(String.join(".", currentSegments));
            }
            return;
        }

        // Try to place a dot after 1, 2, or 3 digits
        for (int len = 1; len <= 3; len++) {
            // Ensure we do not go out of bounds
            if (startIndex + len > s.length()) {
                break;
            }

            String segment = s.substring(startIndex, startIndex + len);

            // Check if the current segment is valid
            if (isValid(segment)) {
                currentSegments.add(segment);
                // Recursively look for the next segment
                backtrack(s, startIndex + len, currentSegments, result);
                // Backtrack: Remove the last added segment to try other combinations
                currentSegments.remove(currentSegments.size() - 1);
            }
        }
    }

    private boolean isValid(String segment) {
        // Check for leading zeros: "0" is valid, but "01", "00" etc. are invalid
        if (segment.length() > 1 && segment.charAt(0) == '0') {
            return false;
        }
        
        // Check if the value is between 0 and 255
        int num = Integer.parseInt(segment);
        return num >= 0 && num <= 255;
    }
}
