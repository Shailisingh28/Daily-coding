public class copyRandomList {
    Node head;

    public static class Node {
        int val;
        Node next;
        Node randome;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        Node temp = head;
        while (temp != null) {
            Node copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
            temp = copy.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.randome != null) {
                temp.next.randome = temp.randome.next;
            }
            temp = temp.next.next;
        }
        temp = head;
        Node dummy = new Node(-1);
        Node res = dummy;
        while (temp != null) {
            Node copy = temp.next;
            res.next = copy;
            res = copy;
            temp.next = copy.next;
            temp = temp.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        copyRandomList obj = new copyRandomList();

        // Creating nodes
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        // Linking next pointers
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Setting random pointers (complex structure)
        n1.randome = null;
        n2.randome = n1;
        n3.randome = n5;
        n4.randome = n3;
        n5.randome = n1;

        obj.head = n1;

        // Copy the list
        Node copiedHead = obj.copyRandomList(obj.head);

        // Print original list
        System.out.println("Original List:");
        Node temp = obj.head;
        while (temp != null) {
            int randVal = (temp.randome != null) ? temp.randome.val : -1;
            System.out.println("Val: " + temp.val + ", Random: " + randVal);
            temp = temp.next;
        }

        // Print copied list
        System.out.println("\nCopied List:");
        temp = copiedHead;
        while (temp != null) {
            int randVal = (temp.randome != null) ? temp.randome.val : -1;
            System.out.println("Val: " + temp.val + ", Random: " + randVal);
            temp = temp.next;
        }
    }
}
