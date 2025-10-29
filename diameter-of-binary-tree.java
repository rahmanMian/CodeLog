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

/*


      2
     / \
    3   4
   /   
  1

--start at 2

int left = algo(3) -> algo(1) -> 0 -> algo(null) -> 0 -> maxCount for 1 > 0 ? reuturns 1

algo(3) takes algo(1) which is 1 for left
algo(3) right is null so algo 3 returns 2


int right = algo(4)

*/


class Solution {
    int maxCount = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxCount;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

        int leftDepth = dfs(node.left);
        int rightDepth = dfs(node.right);

        // update max diameter at this node
        maxCount = Math.max(maxCount, leftDepth + rightDepth);

        // return the depth of this subtree
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
