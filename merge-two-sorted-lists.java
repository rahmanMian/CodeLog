/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
*
 */



//very standard just 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

     //DUMMY NODE FOR EDGE CASE  
     ListNode dummy = new ListNode(0); //dont make this null
     ListNode node = dummy;

     while(list1 != null && list2 != null){
        
        if(list1.val < list2.val){
            node.next = list1;
            list1 = list1.next;

        }else{
            node.next = list2;
            list2 = list2.next;
        }

        node = node.next;
     }

     if(list1 == null){
        node.next = list2;
     }else{
        node.next = list1;
     }


     return dummy.next;

    }

}
