// leetcode 95 solution 
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
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        return buildTrees(1, n);
    }

    private List<TreeNode> buildTrees(int start, int end) {
        List<TreeNode> allTrees = new ArrayList<>();
        
        // Base case: if start > end, there is no node to choose.
        // We append null to represent an empty subtree.
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }

        // Pick each number as a root node sequentially
        for (int i = start; i <= end; i++) {
            // Generate all possible left subtrees
            List<TreeNode> leftTrees = buildTrees(start, i - 1);

            // Generate all possible right subtrees
            List<TreeNode> rightTrees = buildTrees(i + 1, end);

            // Combine each left and right subtree with the current root 'i'
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode currentRoot = new TreeNode(i);
                    currentRoot.left = left;
                    currentRoot.right = right;
                    allTrees.add(currentRoot);
                }
            }
        }
        
        return allTrees;
    }
}
