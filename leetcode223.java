// leetcode solution 223 java
class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        // Calculate the area of the first rectangle
        int areaA = (ax2 - ax1) * (ay2 - ay1);
        
        // Calculate the area of the second rectangle
        int areaB = (bx2 - bx1) * (by2 - by1);
        
        // Calculate the overlap dimensions
        int overlapWidth = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int overlapHeight = Math.min(ay2, by2) - Math.max(ay1, by1);
        
        // If there is an overlap, calculate its area
        int overlapArea = 0;
        if (overlapWidth > 0 && overlapHeight > 0) {
            overlapArea = overlapWidth * overlapHeight;
        }
        
        // Total area is the sum of both minus the overlapping area
        return areaA + areaB - overlapArea;
    }
}
// soumya