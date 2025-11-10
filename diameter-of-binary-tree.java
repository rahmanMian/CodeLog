/**
TRICY PART IS RETURING THE HEIGH NOT THE ACUTRAL DIAMAETER- THE ISSUE WITH THIS QUESTIO IS THAYT YOU RAN IN TO THE SOLUTOIN TOO EARLY FROM NOW ON YOU HAVE TO WRITE ALL THE REQUIEMENTS FIRST
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


/*
    2
   / \
  3   5
     /                                                                                                                                           return Math.max(leftDept, rightDept) + 1 = 2
    4 
                                                                                                return (leftDept, rightDept) + 1               __________________________

Stack it                                                                                  ____________________________
                                                                                          maxCount = 0                                  maxCount = 1
                                                                                       __________________________                           _____________________________

                                        Math.max(leftDept, rightDept) + 1                dfs(4.right == null) = 0                       _____________________________
______                                    ________________________                            _______________________                        
                                           maxCount = 0                                    dfs(4.left == null) = 0                            dfs(5.right === null) = 0  rightDept = 0
                                         _________________________                      ________________                                   ______________________________
______                                                                                                                                                                                                      return 3
                                            dfs(3.right == null)  rightDept = 0          dfs(5.left = 4)                                         dfs(5.left = 4) = 1    leftDept = 1                        _______________
______                                     _______________                           _________________                                         __________________
                                                                                                                                                                                                     maxCount = 3
dfs(3.left == null) returns 0               dfs(3.left == null) leftDept 0                                                                                                                      ______________________________
                                                                                      dfs(2.right = 5)                                        dfs(2.right = 5)                       dfs(2.right) = rightDept = 2
                                             _________                              _________________                                          __________________                   _____________________
_______                                   dfs(2.left = 3)                           dfs(2.left = 3) = 1                     
dfs(2.left = 3)                           ____________                           ________________                                           dfs(2.left = 3) = 1                   dfs(2.left) = leftDept = 1
_______ 
dfs(root = 2)                                 dfs(root = 2)                         dfs(root = 2)                                            dfs(root = 2)                      ______________
_______                                   ____________                           ______________                                             ______________                      dfs(root = 2)
 
*/


class Solution {
    int maxCount = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxCount;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;
        // calculate the height at every node then find the max diameter by adding them
        int leftDepth = dfs(node.left);
        int rightDepth = dfs(node.right);

        // update max diameter at this node
        maxCount = Math.max(maxCount, leftDepth + rightDepth);

        // return the depth of this subtree
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
