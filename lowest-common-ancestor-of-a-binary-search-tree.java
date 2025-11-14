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

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
    }
}
