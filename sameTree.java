/**
Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
**/
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //depth-first traverse both tree
        if ( (p == null && q != null) || p != null && q == null )
            return false;
        if (p == null && q == null)
            return true;
        if(p.val != q.val)
            return false;
        // if(p.val == q.val){
            return (isSameTree(p.left, q.left) & isSameTree(p.right, q.right));    
        // }
        
    }
     
}