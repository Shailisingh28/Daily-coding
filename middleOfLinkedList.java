public class middleOfLinkedList {
    private Node head;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node middleOfLinkedList(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(8);
        head.next.next = new Node(7);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(3);
        middleOfLinkedList obj = new middleOfLinkedList();
        Node mid = obj.middleOfLinkedList(head);
        System.out.println(mid.val);
    }
}
