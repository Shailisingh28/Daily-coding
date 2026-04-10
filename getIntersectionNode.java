public class getIntersectionNode {
    Node head1;
    Node head2;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node getIntersectionNode(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        Node t1 = head1;
        Node t2 = head2;
        while (t1 != t2) {
            t1 = (t1 != null) ? t1.next : head2;
            t2 = (t2 != null) ? t2.next : head1;
        }
        return t1;
    }

    public static void main(String[] args) {
        getIntersectionNode obj = new getIntersectionNode();
        obj.head1 = new Node(4);
        obj.head1.next = new Node(1);
        obj.head1.next.next = new Node(8);
        obj.head2 = new Node(5);
        obj.head2.next = new Node(6);
        obj.head2.next.next = new Node(1);
        obj.head2.next.next.next = obj.head1.next.next;
        obj.head2.next.next.next.next = new Node(4);
        obj.head2.next.next.next.next.next = new Node(5);
        Node ans = obj.getIntersectionNode(obj.head1, obj.head2);
        System.out.println(ans.val);
    }
}
