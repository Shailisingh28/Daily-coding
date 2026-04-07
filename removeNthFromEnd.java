public class removeNthFromEnd {
    private Node head;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node removeNthFromEnd(Node head, int k) {
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    // int n = 1;
    // Node newhead = reverse(head);
    // if (k == 1) {
    // newhead = newhead.next;
    // return newhead;
    // }
    // Node pre = null;
    // Node temp = newhead;
    // while (k != n) {
    // pre = temp;
    // temp = temp.next;
    // n++;
    // }
    // pre.next = temp.next;
    // newhead = reverse(newhead);
    // return newhead;
    // }

    // public Node reverse(Node head) {
    // if (head == null || head.next == null) {
    // return head;
    // }
    // Node pre = null;
    // Node curr = head;
    // Node next = curr;
    // while (curr != null) {
    // next = curr.next;
    // curr.next = pre;
    // pre = curr;
    // curr = next;
    // }
    // return pre;
    // }

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
        removeNthFromEnd obj = new removeNthFromEnd();
        obj.head = new Node(1);
        obj.head.next = new Node(2);
        obj.head.next.next = new Node(3);
        obj.head.next.next.next = new Node(4);
        obj.head.next.next.next.next = new Node(5);
        int k = 2;
        obj.head = obj.removeNthFromEnd(obj.head, k);
        obj.display();

    }
}
