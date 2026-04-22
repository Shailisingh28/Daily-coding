package Recursion;

public class sizeofcycle {
    Node head;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public int cycle(Node head) {
        Node slow = head;
        Node fast = head;
        int sizeofcycle = 1;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast = fast.next;
                while (fast != slow) {
                    fast = fast.next;
                    sizeofcycle++;
                }
                return sizeofcycle;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        sizeofcycle obj = new sizeofcycle();
        obj.head = new Node(1);
        obj.head.next = new Node(2);
        obj.head.next.next = new Node(3);
        obj.head.next.next.next = new Node(4);
        // obj.head.next.next.next.next = obj.head.next;
        System.out.println(obj.cycle(obj.head));

    }
}
