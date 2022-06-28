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
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root.left == null && root.right == null) return 0 ;
        else if(root.left == null || root.right == null) return pathTree(root.left, root.right); 
        else return  1 + pathTree(root.left, root.right);   
             
        
    }

    
    private int pathTree(TreeNode left, TreeNode right){
        if(left == null && right == null) return 0;
        else if (right == null ) return 1 + pathTree(left.left, left.right);
        else if (left == null)  return 1 + pathTree(right.left, right.right);
        else return 1 + pathTree(left.left, left.right) + pathTree(right.left, right.right);
    }
}


