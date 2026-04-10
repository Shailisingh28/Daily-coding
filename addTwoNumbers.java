public class addTwoNumbers {
    Node head1;
    Node head2;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node addTwoNumbers(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node temp = dummy;
        Node h1 = head1;
        Node h2 = head2;
        int carry = 0;
        while (carry != 0 || h1 != null || h2 != null) {
            int sum = carry;
            if (h1 != null) {
                sum += h1.val;
                h1 = h1.next;
            }
            if (h2 != null) {
                sum += h2.val;
                h2 = h2.next;
            }
            Node newnNode = new Node(sum % 10);
            temp.next = newnNode;
            temp = temp.next;
            carry = sum / 10;
        }
        return dummy.next;
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        addTwoNumbers obj = new addTwoNumbers();
        obj.head1 = new Node(4);
        obj.head1.next = new Node(5);
        obj.head1.next.next = new Node(6);
        obj.head2 = new Node(1);
        obj.head2.next = new Node(2);
        obj.head2.next.next = new Node(3);
        Node result = obj.addTwoNumbers(obj.head1, obj.head2);
        obj.printList(result);
    }
}
