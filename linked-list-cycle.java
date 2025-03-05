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
public class Solution {
    public boolean hasCycle(ListNode head) {

        
        Set<ListNode> seen = new HashSet<>();


        while(head != null){
            //each conject has a hashCode which is locatin based. since we are storing objects the .val can be the same
           if(!seen.add(head)){
            return true;
           }
           head = head.next;
        }

        return false;
    }
}
