/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


//HASHSET SOLUTION
//T-O(n) M-O(n))
public class Solution {
    public boolean hasCycle(ListNode head) {

        
        Set<ListNode> seen = new HashSet<>();


        while(head != null){
            //each object has a hashCode which is locatin based. since we are storing objects the .val can be the same
           if(!seen.add(head)){
            return true;
           }
           head = head.next;
        }

        return false;
    }
}
