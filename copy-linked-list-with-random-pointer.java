/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

/*
Make HashMap of type node,node
Loop through list and make deep copy of values
Loop through list again and reference the new values from there and use the old connections for this list


*/
class Solution {
    public Node copyRandomList(Node head) {
       Map<Node, Node> map = new HashMap<>();


       Node curr = head;

       while(curr != null){
        Node val = new Node(curr.val);
        map.put(curr, val);
        curr = curr.next;
       }

       curr = head;

       while(curr != null){
        Node val = map.get(curr);
        val.next = map.get(curr.next);
        val.random = map.get(curr.random);
        curr = curr.next;
       }

       return map.get(head);
    }
} 
