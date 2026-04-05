public class hasCycle {
    private Node head;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        hasCycle obj = new hasCycle();
        obj.head = new Node(1);
        obj.head.next = new Node(2);
        obj.head.next.next = new Node(3);
        obj.head.next.next.next = new Node(4);
        obj.head.next.next.next.next = new Node(5);
        // obj.head.next.next.next.next.next = obj.head.next;
        System.out.println(obj.hasCycle(obj.head));
    }
}
