public class deleteDuplicates {
    private Node head;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node deleteDuplicates(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty list");
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
        deleteDuplicates obj = new deleteDuplicates();
        obj.head = new Node(1);
        obj.head.next = new Node(1);
        obj.head.next.next = new Node(1);
        obj.head.next.next.next = new Node(2);
        obj.head.next.next.next.next = new Node(3);
        obj.head = obj.deleteDuplicates(obj.head);
        obj.display();

    }
}
