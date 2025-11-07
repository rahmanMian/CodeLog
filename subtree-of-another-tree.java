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
 My first move would be to traverse throught the main tree and keepo the subroot in check the second we kit the first node equal just use the same subtree algo with the differecne being that if the subroot continues then false but if it ends and main tree runs or both end at same then true ->keep goign till main tree is alive
 i made the mistake of comapin objects ont vlaues and i have to think aboout the exact fail cases
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return traverseMain(root, subRoot);
    }

    public boolean traverseMain(TreeNode root, TreeNode subRoot){

        if(root == null){
            return false;
        }

 
           if(isSubTreePresent(root, subRoot)){
            return true;
           }


       return  traverseMain(root.left, subRoot) || traverseMain(root.right, subRoot);
    }

    public boolean isSubTreePresent(TreeNode root, TreeNode subRoot){
          
                if(root == null && subRoot == null){
                    return true;
                } 

                if(root == null  || subRoot == null){
                    return false;
                }

                  if (root.val != subRoot.val) {
            return false;
        }
                return isSubTreePresent(root.left, subRoot.left) && isSubTreePresent(root.right, subRoot.right);
               

    }
}
