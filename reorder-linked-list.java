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

O(N) - BRUTE FORCE
STILL DONT GET COMPLETLY
Interlace by simplying setting opposite pointers front and back
when i has reached j that is the final node. make that node null out of the loop
*/
class Solution {
    public void reorderList(ListNode head) {

        if(head == null){
            return;
        }

        List<ListNode> nodes = new ArrayList<>();

        ListNode curr = head;

        while(curr != null){
            nodes.add(curr);
            curr = curr.next;
        }
        
        int i = 0,  j = nodes.size() - 1;

        while (i < j){

            nodes.get(i).next = nodes.get(j);
            i++;

            while (i >= j){break;}

            nodes.get(j).next = nodes.get(i);
            j--;
        }

        nodes.get(i).next = null;
}
}
