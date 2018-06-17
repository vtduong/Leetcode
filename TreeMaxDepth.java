/***
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
***/
class Solution {
    private int rightHeight = 0;
    private int leftHeight = 0;
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        leftHeight = depth(root.left);
        rightHeight += depth(root.right);
        return Math.max(leftHeight, rightHeight) +1;
        
    }
    
    private int depth(TreeNode node){
        if(node == null)
            return 0;
        return 1 + Math.max(depth(node.left), depth(node.right));
    }
}