public class reverseKGroup {
    Node head;

    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node reverseKGroup(Node head, int k) {
        Node temp = head;
        for (int i = 0; i < k; i++) {
            if (temp == null)
                return head;
            temp = temp.next;
        }
        Node pre = null;
        Node curr = head;
        Node next = null;
        for (int i = 0; i < k; i++) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head.next = reverseKGroup(curr, k);
        return pre;
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
        reverseKGroup obj = new reverseKGroup();
        obj.head = new Node(1);
        obj.head.next = new Node(2);
        obj.head.next.next = new Node(3);
        obj.head.next.next.next = new Node(4);
        obj.head.next.next.next.next = new Node(5);
        obj.head.next.next.next.next.next = new Node(6);

        obj.head = obj.reverseKGroup(obj.head, 2);
        obj.display();
    }
}
