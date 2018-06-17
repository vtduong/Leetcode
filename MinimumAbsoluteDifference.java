/**
Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.
**/
class Solution {
    int min = Integer.MAX_VALUE;
    int prev = -1;
    
    public int getMinimumDifference(TreeNode root) {
        //in-order traversal and compare adjacent values
       if (root == null){
           return min;
       }
        
        getMinimumDifference(root.left);
        
        if(prev >= 0){
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        
        getMinimumDifference(root.right);
        
        return min;
        
    }
}