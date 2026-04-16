public class insertusingrecursion {
    private Node head;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node insertusingrecursion(Node head, int val, int index) {
        if (index == 0) {
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }
        if (head == null) {
            System.out.println("empty list");
            return head;
        }
        head.next = insertusingrecursion(head.next, val, index - 1);
        return head;
    }

    public void display() {
        if (head == null) {
            System.out.println("list is empty");
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
        insertusingrecursion obj = new insertusingrecursion();
        obj.head = new Node(1);
        obj.head.next = new Node(3);
        obj.head.next.next = new Node(4);
        obj.head.next.next.next = new Node(5);
        obj.head = obj.insertusingrecursion(obj.head, 2, 1);
        obj.display();

    }
}
