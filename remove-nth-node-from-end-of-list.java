class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

      //intialise two nodes to head
      //move fast by n spots via loop(i < n)
      //if fast null means remove first node, simple-> return head.next
      //else take fast to end of list and move slow by that many moves
      //this sets slow up to be before removed node
      //set slow.next = slow.next.next
      //return head

     ListNode slow = head, fast = head;

     for(int i = 0; i < n; i++){
         fast = fast.next;
     }

     if(fast == null){return head.next;}
    
    while(fast.next != null){//this mean fast is as the last node and slow is right beofre the removed node
        slow = slow.next;
        fast = fast.next;
    }
    slow.next = slow.next.next;

 return head;

}


}
