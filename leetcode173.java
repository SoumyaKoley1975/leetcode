// leetcode 173 solution new

import java.util.Stack;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class BSTIterator {
    // Stack to track the paths/nodes for controlled in-order traversal
    private Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        // Initialize the stack by adding the root and all its leftmost descendants
        pushLeftBranches(root);
    }
    
    /** @return the next smallest number */
    public int next() {
        // The top of the stack contains the next smallest node
        TreeNode node = stack.pop();
        
        // If the popped node has a right child, process its left branches
        if (node.right != null) {
            pushLeftBranches(node.right);
        }
        
        return node.val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        // If the stack is not empty, there is a next element available
        return !stack.isEmpty();
    }

    // Helper function to push the current node and all its left children onto the stack
    private void pushLeftBranches(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
}

// Soumya
