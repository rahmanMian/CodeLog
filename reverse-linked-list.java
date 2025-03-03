/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        //curr
        //A -> B -> C  -> null
        while(curr != null){
            //keep the next value in store as we will lose it.
            //temp = B
            ListNode temp = curr.next;
            //null <- A
            curr.next = prev;
            //prev = A
            prev = curr;
            //curr = B
            curr = temp;
        }

        return prev;
    }
}

//Recursive approach
