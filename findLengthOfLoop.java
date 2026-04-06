public class findLengthOfLoop {
    private Node head;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public int findLengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                int size = 1;
                Node temp = slow;
                while (temp.next != slow) {
                    temp = temp.next;
                    size++;
                }
                return size;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        findLengthOfLoop obj = new findLengthOfLoop();
        obj.head = new Node(1);
        obj.head.next = new Node(2);
        obj.head.next.next = new Node(3);
        obj.head.next.next.next = new Node(4);
        obj.head.next.next.next.next = new Node(5);
        // obj.head.next.next.next.next.next = obj.head.next;
        System.out.println(obj.findLengthOfLoop(obj.head));
    }
}
