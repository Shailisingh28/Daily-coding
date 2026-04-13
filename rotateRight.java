public class rotateRight {
    Node head;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node rotateRight(Node head, int k) {
        if (head == null || k == 0)
            return head;
        int n = 1;
        Node temp = head;
        while (temp.next != null) {
            n++;
            temp = temp.next;
        }
        Node tail = temp;
        k = k % n;
        if (k == 0) {
            return head;
        }
        temp = head;
        for (int i = 1; i < n - k; i++) {
            temp = temp.next;
        }
        Node next = temp.next;
        temp.next = null;
        tail.next = head;
        head = next;
        return head;
        // if (head == null || head.next==null) {
        // return head;
        // }
        // for (int i = 0; i < k; i++) {
        // Node temp = head;
        // while (temp.next.next != null) {
        // temp = temp.next;
        // }
        // Node next = temp.next;
        // temp.next = null;
        // next.next = head;
        // head = next;
        // }
        // return head;
    }

    public void display() {
        if (head == null) {
            System.out.println("empty list");
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
        rotateRight obj = new rotateRight();
        obj.head = new Node(0);
        obj.head.next = new Node(1);
        obj.head.next.next = new Node(2);
        // obj.head.next.next.next = new Node(4);
        // obj.head.next.next.next.next = new Node(5);
        obj.head = obj.rotateRight(obj.head, 4);
        obj.display();
    }
}
