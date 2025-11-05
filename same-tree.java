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
/**

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        return traverse(p, q);
        
    }


 public boolean traverse(TreeNode nodeP, TreeNode nodeQ){

   
     // both null => same
        if (nodeP == null && nodeQ == null) return true;

        // one null and the other not => different
        if (nodeP == null || nodeQ == null) return false;

        // values differ => different
        if (nodeP.val != nodeQ.val) return false;

        // recursively check left and right
        return traverse(nodeP.left, nodeQ.left) && traverse(nodeP.right, nodeQ.right);

 }
}
