/**
Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

The root is the maximum number in the array.
The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree.
**/
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = null;
        return constructTree(root, nums);
    }
    
    private TreeNode constructTree(TreeNode node, int[] nums){
        //basic case
        if(nums.length == 0){
            return null;
        }
        
            
        //find max
        //int max = Collections.max(Arrays.asList(nums));
        //int idx = Arrays.asList(nums).indexOf(max);
        int max = nums[0];
        int idx = 0;
        for(int k = 0; k < nums.length-1; k++){
            if(max < nums[k+1]){
                max = nums[k+1];
                idx = k+1;
            }
        }
        node = new TreeNode(max);
        //divide array by the max idx
        int[] left = new int[idx - 0];
        int[] right = new int[nums.length - (idx+1)];
        for(int i = 0; i < left.length; i++){
             left[i] = nums[i];
        }
        for(int j = 0; j < right.length; j++){
            right[j] = nums[idx+1 +j];
        }
        //construct tree
        node.left = constructTree(node, left);
        node.right = constructTree(node, right);
        return node;
        
    }
}