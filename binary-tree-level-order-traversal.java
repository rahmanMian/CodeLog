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


my code will fail here 
        1
       / \
      2   3
     /     \
    4       5
4 and 5 are the same level but they aren't connected
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //List is an interface not a class -> you cannot do new List<>();
        List<List<Integer>> list = new ArrayList<>();
    if(root != null){
        list.add(Arrays.asList(root.val));
        traverseLevel(root, list);
    }
        return list;
    }

    public void traverseLevel(TreeNode curr, List<List<Integer>> list){
        List<Integer> li = new ArrayList<>();
          if (curr != null) {
            if(curr.left != null){
         li.add(curr.left.val);
            }
            if(curr.right != null){
         li.add(curr.right.val);
            }
        }
        if(!li.isEmpty())
        list.add(li);

        if(curr.left != null)
         traverseLevel(curr.left, list);
         if(curr.right != null)
         traverseLevel(curr.right, list);
    }

}
