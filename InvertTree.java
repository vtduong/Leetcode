/***
Invert a binary tree.
***/

class Solution {
    TreeNode result;
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
        
    }
}