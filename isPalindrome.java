public class isPalindrome {
    private Node head;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public boolean isPalindrome(Node head) {
        Node mid = middle(head);
        Node newHead = reverse(mid.next);
        Node slow = head;
        Node fast = newHead;
        while (fast != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
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

    public Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node pre = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        isPalindrome list = new isPalindrome();
        list.head = new Node(1);
        // list.head.next = new Node(21);
        // list.head.next.next = new Node(2);
        // list.head.next.next.next = new Node(1);
        System.out.println(list.isPalindrome(list.head));
    }
}
