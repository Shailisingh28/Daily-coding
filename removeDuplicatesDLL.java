public class removeDuplicatesDLL {
    Node head;

    public static class Node {
        int val;
        Node pre;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node removeDuplicatesDLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node t1 = head;
        Node t2 = head.next;
        while (t1 != null && t2 != null) {
            if (t1.val == t2.val) {
                t2 = t2.next;
            } else {
                t1.next = t2;
                t2.pre = t1;
                t1 = t2;
                t2 = t2.next;
            }
        }
        t1.next = null;
        return head;
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
        removeDuplicatesDLL obj = new removeDuplicatesDLL();
        obj.head = new Node(3);
        obj.head.next = new Node(3);
        obj.head.next.pre = obj.head;
        obj.head.next.next = new Node(3);
        obj.head.next.next.pre = obj.head.next;
        obj.head.next.next.next = new Node(3);
        obj.head.next.next.next.pre = obj.head.next.next;
        obj.head.next.next.next.next = new Node(3);
        obj.head.next.next.next.next.pre = obj.head.next.next.next;
        obj.head.next.next.next.next.next = new Node(3);
        obj.head.next.next.next.next.next.pre = obj.head.next.next.next.next;
        obj.head = obj.removeDuplicatesDLL(obj.head);
        obj.display();
    }
}
