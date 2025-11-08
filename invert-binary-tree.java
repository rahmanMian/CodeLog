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
 * } this
 */
//spli st fork and swap
// make two funcs

class Solution {
    public TreeNode invertTree(TreeNode root) {
            traverse(root);

            return root;
    }


    public void traverse(TreeNode root){
        if(root == null){return;}

         TreeNode temp = root.right;

         root.right = root.left;
         root.left = temp;

         traverse(root.right);
         traverse(root.left);
    }

}
