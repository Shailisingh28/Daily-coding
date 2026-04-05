public class reverseListusingrecursion {
    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node reverseusingrecursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newnNode = reverseusingrecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newnNode;
    }
}
