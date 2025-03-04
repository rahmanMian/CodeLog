/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 FINISH THSI
 
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null || list2 == null){
            return null;
        }

        if(list1.val < list2.val){
            
            list2.next.next = list1.next;
            list1.next = list2;
            return list1;
        }else{
            list1.next.next = list2.next;
            list2.next = list1;
            return list2;
        }

        
    }
}
