
public class findStartingPoint {
    private Node head;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node findStartingPoint(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                int index = 0;
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                    index++;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        findStartingPoint obj = new findStartingPoint();
        obj.head = new Node(1);
        obj.head.next = new Node(2);
        obj.head.next.next = new Node(3);
        obj.head.next.next.next = new Node(4);
        obj.head.next.next.next.next = new Node(5);
        // obj.head.next.next.next.next = obj.head.next;
        Node start = obj.findStartingPoint(obj.head);
        System.out.println(start != null ? start.val : start);
    }
}
