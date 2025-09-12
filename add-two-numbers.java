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


/*
   int value = sum % 10;
      carry = sum /  10;



*/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       // make a dummy note
        ListNode dummy = new ListNode();
       //name a node point to it
         ListNode cur = dummy;

        int carry = 0;
        //if one list isnt null or botth null and carry not zero
        while(l1 != null || l2 != null || carry != 0){
             //if l1 is nnot null take val else give it 0
            int val1 = (l1 == null) ? 0 : l1.val;
          //if l2 is nnot null take val else give it 0
            int val2 = (l2 == null) ? 0 : l2.val;
            //sum of call
            int sum = val1 + val2 + carry;
            //need first digit
            int value = sum % 10;
           //carry is / 10
             carry = sum /  10;
            //fist digit applied to node
            ListNode node = new ListNode(value);
            //point curr next to it
            cur.next = node;
             //move to it
            cur = cur.next;
             // move the poitners for lists
             l1 = (l1== null) ? null : l1.next;
             l2 = (l2 == null) ? null : l2.next;
        }

       //.next is implicitly null
        return dummy.next;
        
    }
}
