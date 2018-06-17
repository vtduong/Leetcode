/**
Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
**/
class Solution {
    int result;
    public int diameterOfBinaryTree(TreeNode root) {
        result = 1;
        depth(root);
        //only count the edges
        return result -1;
    }
    private int depth(TreeNode node){
        if (node == null)
            return 0;
        //keep track of number of nodes of each left and right subtree
        int l = depth(node.left);
        int r = depth(node.right);
        //whichever has greater length
        result = Math.max(result, l + r + 1);
        return Math.max(l, r) +1;
    }
}