public class flattenLinkedList {
    Node head;

    public static class Node {
        int val;
        Node next;
        Node child;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node flattenLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mergehead = flattenLinkedList(head.next);
        return merge(head, mergehead);
    }

    public Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        dummy.next = null;
        dummy.child = null;
        Node res = dummy;
        Node t1 = head1;
        Node t2 = head2;
        while (t1 != null && t2 != null) {
            if (t1.val < t2.val) {
                res.child = t1;
                res = t1;
                t1 = t1.child;
            } else {
                res.child = t2;
                res = t2;
                t2 = t2.child;
            }
        }
        if (t1 != null) {
            res.child = t1;
        }
        if (t2 != null) {
            res.child = t2;
        }
        return dummy.child;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.child;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        flattenLinkedList obj = new flattenLinkedList();

        // Creating nodes (random values)
        Node n5 = new Node(5);
        Node n10 = new Node(10);
        Node n19 = new Node(19);
        Node n28 = new Node(28);

        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n30 = new Node(30);

        Node n20 = new Node(20);

        Node n22 = new Node(22);
        Node n50 = new Node(50);

        Node n35 = new Node(35);
        Node n40 = new Node(40);
        Node n45 = new Node(45);

        // Horizontal (next)
        n5.next = n10;
        n10.next = n19;
        n19.next = n28;

        // Vertical (child) → each list sorted
        n5.child = n7;
        n7.child = n8;
        n8.child = n30;

        n10.child = n20;

        n19.child = n22;
        n22.child = n50;

        n28.child = n35;
        n35.child = n40;
        n40.child = n45;

        obj.head = n5;

        // Flatten
        Node flatHead = obj.flattenLinkedList(obj.head);

        // Print result
        Node temp = flatHead;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.child;
        }
        System.out.println("null");
    }
}
