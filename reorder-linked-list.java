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

T - O(N) M - O(N) - BRUTE FORCE
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

//T - O(N) M - O(1) - REVERSE AND MERGE
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        // Step 1: Find the middle of the list
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode second = slow.next;
        ListNode prev = slow.next = null;  // Split the list into two halves
        
        
        while (second != null) {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }
        
        // Step 3: Merge two halves
        ListNode first = head;
        second = prev;  // `prev` now points to the head of the reversed second half
        
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
    }
}

