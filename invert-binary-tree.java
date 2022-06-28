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
    public TreeNode invertTree(TreeNode root) {
        if(root == null ) return null;
        
        if(ReplaceNode( root.left, root.right) == true ) return root;
    return null;
    };
    private boolean ReplaceNode(TreeNode left, TreeNode right){ 
        
        if(left != null && right != null){
             Object temp = new Object();
             temp = right.val;
             right.val = left.val;
             left.val = (int)temp;  
        }
        else return true; 
       
    return ReplaceNode(left.right, right.left) && ReplaceNode(left.left, right.right) ;     
    }  
}