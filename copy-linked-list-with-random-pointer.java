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
        Map<Node, Node> old = new HashMap<>();
     
        Node cur = head;
        while (cur != null){
            Node copy = new Node(cur.val);
            old.put(cur, copy);
            cur = cur.next;
        }

        cur = head;
        while (cur != null) {
            Node copy = old.get(cur);
            copy.next = old.get(cur.next);
            copy.random = old.get(cur.random);
            cur = cur.next;
        }

        return old.get(head);
    }
}
