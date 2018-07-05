/**
in-order traversal a binary tree
**/

class Solution {
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return list;
    }
    public void traverse(TreeNode root){
        if(root == null)
            return;
        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }
}