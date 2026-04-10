public class addOne {
    private Node head;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node addOne(Node head) {
        int carry = carry(head);
        if (carry == 1) {
            Node newnNode = new Node(1);
            newnNode.next = head;
            head = newnNode;
            return newnNode;
        }
        return head;

    }

    public int carry(Node head) {
        if (head == null) {
            return 1;
        }
        Node temp = head;
        int carry = carry(temp.next);
        int sum = carry + temp.val;
        temp.val = sum % 10;
        return sum / 10;
    }

    public void display() {
        if (head == null) {
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
        addOne obj = new addOne();

        obj.head = new Node(9);
        obj.head.next = new Node(9);
        obj.head.next.next = new Node(9);

        obj.head = obj.addOne(obj.head);

        obj.display();
    }
}
