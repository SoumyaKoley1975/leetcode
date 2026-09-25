// leetcode solution 
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        // Initial bounds are set to negative and positive infinity using null
        return validate(root, null, null);
    }
    
    private boolean validate(TreeNode node, Long min, Long max) {
        // Base case: an empty tree is a valid BST
        if (node == null) {
            return true;
        }
        
        // The current node's value must be strictly within the (min, max) boundaries
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }
        
        // Recursively validate subtrees with updated boundaries:
        // Left child must be smaller than the current node's value (updates max bound)
        // Right child must be greater than the current node's value (updates min bound)
        return validate(node.left, min, (long) node.val) && 
               validate(node.right, (long) node.val, max);
    }
}
