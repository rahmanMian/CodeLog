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
 *}
 */
/* Lets get this straih -> what is a balanceed tree -> a tree whoses forks have a difference of dept by one max -> i made the mistakete

          1
        /   \
       2     2
      /       \
     3         3
    /           \
   4             4
   THIS IS THE CASE WHY YOU HAVE TO CHECK EVERY NODE
*/

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null)return true;

        if(Math.abs(getHeight(root.left) - getHeight(root.right) ) > 1){
            return false;
        }
        
         return isBalanced(root.left) && isBalanced(root.right);
    }

public int getHeight(TreeNode node) {
    if (node == null) return 0;
    return 1 + Math.max(getHeight(node.left), getHeight(node.right));
}
}
