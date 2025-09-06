/**

Your recursion is weak
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
//iterative easy focus on recursion

 Iterative
 T-O(N) M - O(1)
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
//T-O(N) M- O(N)

/*
1.Use recursion to find last node.
2. Make its next null as if this was the only node its next would be null
3.roll back
4.store the lastnode head in new head.
5.make the last node point to the current rolled back head by using head.next.next
6.make current node point to null
3.roll back ....
*/
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newHead = head;
        if (head.next != null) {
            newHead = reverseList(head.next);
            head.next.next = head;
        }
        head.next = null;

        return newHead;
    }
}
