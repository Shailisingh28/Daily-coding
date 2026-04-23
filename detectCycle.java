public class detectCycle {
    Node head;

    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        detectCycle obj = new detectCycle();
        obj.head = new Node(1);
        obj.head.next = new Node(2);
        obj.head.next.next = obj.head;
        int ans = obj.detectCycle(obj.head).val;
        System.out.println(ans);
    }
}
