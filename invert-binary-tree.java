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
//spli st fork and swap
// make two funcs


class Solution {
    public TreeNode invertTree(TreeNode root) {
        TreeNode rootCopy = root;

        if(root == null){return root;}
  
         traverse(root);
          
          return root;

        }

 
public void traverse(TreeNode node){
    if(node == null){return;}

    TreeNode temp = node.left;
    node.left = node.right;
    node.right = temp;

    traverse(node.left);
    traverse(node.right);
   
}

}
