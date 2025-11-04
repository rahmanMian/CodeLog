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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        return traverse(p, q);
        
    }


 public boolean traverse(TreeNode nodeP, TreeNode nodeQ){

   
    if(nodeP!= null && nodeQ != null){return false;}

    if(nodeP.val != nodeQ.val){ return false;}

    

     traverse(nodeP.left, nodeQ.left);
     traverse(nodeP.right, nodeQ.right);



return true;

 }
}
