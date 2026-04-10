public class sortList {
    private Node head;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = middle(head);
        Node head1 = head;
        Node head2 = mid.next;
        mid.next = null;
        Node left = sortList(head1);
        Node right = sortList(head2);
        Node newhead = merge(left, right);
        return newhead;
    }

    public Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        if (head1 != null)
            temp.next = head1;
        if (head2 != null)
            temp.next = head2;
        return dummy.next;
    }

    public Node middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        sortList obj = new sortList();
        obj.head = new Node(4);
        obj.head.next = new Node(2);
        obj.head.next.next = new Node(1);
        obj.head.next.next.next = new Node(3);
        obj.head = obj.sortList(obj.head);
        obj.display();
    }
}
