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
Return the level order traversal of the binary tree 
1. Left to Right
2. Level to Level
Call Root
Have helper function to traverse for nodes
HaveAnother helper to store values
Send one left store its value
Send one right store its value

   1
  2  3
    4  5



What is the case for a level to be compleate?
Think of the recursion case to sweep a level
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
 /*
Return the level order traversal of the binary tree 
1. Left to Right
2. Level to Level
Call Root
Have helper function to traverse for nodes
HaveAnother helper to store values
Send one left store its value
Send one right store its value

   1
  2  3
    4  5



What is the case for a level to be compleate?
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //make the arraylist we will send back
        List<List<Integer>> result = new ArrayList<>();
        //if root is null return result instantly
        if (root == null) return result;
        //Start with the root value as a list and also send the main list
        sweepLevel(Arrays.asList(root), result);
        return result;
    }

    private void sweepLevel(List<TreeNode> levelNodes, List<List<Integer>> result) {
        if (levelNodes.isEmpty()) return;    // <-- base case
        
        // list of treenodes for next level
        List<TreeNode> next = new ArrayList<>();
        //storing all the values to be returned in the lists value
        List<Integer> values = new ArrayList<>();
        
        // store all the values on that level 
        for (TreeNode node : levelNodes) {
            values.add(node.val);
            if (node.left != null) next.add(node.left);
            if (node.right != null) next.add(node.right);
        }

        result.add(values);
        sweepLevel(next, result);
    }
}

