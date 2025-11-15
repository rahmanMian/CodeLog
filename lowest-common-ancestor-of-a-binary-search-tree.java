/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 /*
Given a BST find the Lowest common node. > For two nodes p and q find the common descneant above them T. Look at exmplamep 2 for edge case





			6
	               / \
                      4   9

P = 4 AND Q = 9

start with P
is p less than Q? Yes
Does P have a root? Yes
No lets move up -> p.root
is node 6 less than Q? Yes
Does Node 6 have a root?No
Move down
Is node 9? Yes 


P = 1 and Q = 9

Root case
start with P
is P less than Q? Yes
move up > p.root
is node 3 less than Q? Yes
move up > p.root.root
is node 6 less than Q? Yes
null(no root) store value
return value

P = 1 and Q = 2
is p less than Q? Yes
move up > p.root
is node 3 less than Q? No
return node 3

		6
	       / \
              3   7
	     / \   \
            




 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 /*
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		// idk why i did this,
            return findPivot(root, p, q);
      
        
    }

    public TreeNode findPivot(TreeNode root,TreeNode leftNode, TreeNode rightNode){

          if(root.val == leftNode.val){return leftNode;}
          if(root.val == rightNode.val){return rightNode;}
          if((root != null) && root.val > leftNode.val && root.val < rightNode.val){return root;} //pivot case
          
          if(root.val < leftNode.val && root.val < rightNode.val){
            return findPivot(root.right, leftNode, rightNode);
          }

             
          if(root.val > leftNode.val && root.val > rightNode.val){
           return findPivot(root.left, leftNode, rightNode);
          }
          
          return root;
    }
}
