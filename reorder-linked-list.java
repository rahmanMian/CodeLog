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
//do thsi wihtout looking tom
class Solution {
    public void reorderList(ListNode head) {
        //empty list
        if(head == null){
            return;
        }
         
         //ArrayList of typpe node
        List<ListNode> nodes = new ArrayList<>();
        //CURR START WITH HED
        ListNode curr = head;
       // add all to array list
        while(curr != null){
            nodes.add(curr);
            curr = curr.next;
        }  
        //pointer at start and ed
        int i = 0,  j = nodes.size() - 1;
         
        while (i < j){
                //first point to last
            nodes.get(i).next = nodes.get(j);
            i++;

            if (i >= j){break;}
           //last point to curr i(since we did i++ it is the next)
            nodes.get(j).next = nodes.get(i);
            //move j bakcl
            j--;
        }
        //last i poinot to null
        nodes.get(i).next = null;
}
}

//T - O(N) M - O(1) - REVERSE AND MERGE
class Solution {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }

       //Step 1: Splid the list in to halves
       ListNode slow = head;
       ListNode fast = head;

       while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
       }

       //Step 2: reverse second half
       ListNode secondHalf = slow.next;
       slow.next = null;
       ListNode prev = null;

       while(secondHalf != null){
        ListNode temp = secondHalf.next;
        secondHalf.next = prev;
        prev = secondHalf;
        secondHalf = temp;
       }


       //Step 3: merge them
       secondHalf = prev;
       ListNode firstHalf = head;
       while(secondHalf != null){
            //first points to second
           //second points to hte next of first
           //move both forward by themselves
            ListNode tmp1 = firstHalf.next;
            ListNode tmp2 = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = tmp1;
            firstHalf = tmp1;
            secondHalf = tmp2;
       }    

    }

}
