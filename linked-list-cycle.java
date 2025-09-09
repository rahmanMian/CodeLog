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


//SLOW FAST POINTER SOLUTION
//T-O(n) M-O(n))
//Why O(N) cuz fast makes up a pos of 1 everytime. so it will take the length of the list at most which is n.
//fast moves twice
public class Solution {
    public boolean hasCycle(ListNode head) {
        //THIS IS ACTAULLY THYE MOVE
        ListNode fast  = head;
        ListNode slow = head;

                                //.next.next will cause an error if we dotn check this - GOOD BOY
        while(fast != null  && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) return true;
        }

        return false;
    }
}
