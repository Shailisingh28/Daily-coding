public class mergeTwoLists {
    Node head;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node mergeTwoLists(Node head1, Node head2) {
        Node dummNode = new Node(-1);
        Node res = dummNode;
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                res.next = temp1;
                temp1 = temp1.next;
            } else {
                res.next = temp2;
                temp2 = temp2.next;
            }
            res = res.next;

        }
        if (temp1 != null) {
            res.next = temp1;
        } else {
            res.next = temp2;
        }
        return dummNode.next;
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
        mergeTwoLists obj = new mergeTwoLists();
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        // Create second list: 2->4->6
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(7);

        obj.head = obj.mergeTwoLists(head1, head2);
        obj.display();

    }
}
