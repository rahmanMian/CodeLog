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

    public static int maxCount;

    public int maxDepth(TreeNode root) {

        maxCount = 0;
        
        traverse(root);
        return maxCount;
    }


    public int traverse(TreeNode node){
        if(node == null){ return 0;}
    

       int leftDept =  1  + traverse(node.left);
       int rightDept = 1 + traverse(node.right);


       maxCount = Math.max(leftDept, rightDept);

       return maxCount;
    }
}
