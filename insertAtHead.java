public class insertAtHead {
    private Node head = null;

    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node insertatfirst(int x, Node head) {
        Node newnNode = new Node(x);
        if (head == null) {
            head = newnNode;
            return head;
        }
        newnNode.next = head;
        head = newnNode;
        return newnNode;
    }

    public static Node deleteHead(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }

    public void print() {
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
        insertAtHead list = new insertAtHead();
        list.head = list.insertatfirst(1, list.head);
        list.head = list.insertatfirst(2, list.head);
        list.head = list.insertatfirst(3, list.head);
        list.head = list.deleteHead(list.head);
        list.print();
    }
}
