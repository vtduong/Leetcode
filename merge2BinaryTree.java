/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        //assume t2 is merged into t1
        if (t2 == null)
            return t1;
        //do a pre-order traversal on t1 and t2
        //create new node if t1 empty
        if(t1 == null)
            t1 = new TreeNode(t2.val);
        //add value if t1 has value
        else{
            t1.val += t2.val;
        }
        //go left
        t1.left = mergeTrees(t1.left, t2.left);
        //go right
        t1.right = mergeTrees(t1.right, t2.right);
        
        return t1;
    }
    
}