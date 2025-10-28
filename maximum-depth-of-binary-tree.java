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
        //keep maxCount here cuz its not supposed to be shared between test cases
        maxCount = 0;
        if(root == null){ return 0;}

       traverse(root, 1); //1 cuz root is 1
       return maxCount;
    }


    public void traverse(TreeNode node, int count){

                if(node == null){return;}
                
                maxCount = Math.max(count, maxCount);
                traverse(node.left, count + 1);
                traverse(node.right, count + 1);
    }


}
