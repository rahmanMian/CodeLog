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
        //List is an interface not a class -> you cannot do new List<>();
        List<List<Integer>> list = new ArrayList<>();
    if(root != null){
        list.add(Arrays.asList(root.val));
        levelSweeper(root.left, root.right, list);
    }
        return list;
    }

    public void levelSweeper(TreeNode leftNode, TreeNode rightNode, List<List<Integer>> list){
        List<Integer> li = new ArrayList<>();
          

          if (leftNode != null) {
            if(leftNode.left != null){
              li.add(leftNode.left.val);
            }
            if(leftNode.right != null){
              li.add(leftNode.right.val);
            }
        }
             if (rightNode != null) {
            if(rightNode.left != null){
              li.add(rightNode.left.val);
            }
            if(rightNode.right != null){
              li.add(rightNode.right.val);
            }
        }


        if(!li.isEmpty()){list.add(li);}
        
        levelSweeper(leftNode.left, rightNode.right, list);

    }

}

}
