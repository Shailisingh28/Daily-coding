public class deleteAllOccurrences {
    private Node head;

    public static class Node {
        int val;
        Node pre;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node deleteAllOccurrences(Node head, int target) {
        if (head == null) {
            return head;
        }
        Node dummy = new Node(-1);
        dummy.next = head;
        head.pre = dummy;
        Node temp = head;
        while (temp != null) {
            if (temp.val == target) {
                Node prev = temp.pre;
                Node nextNode = temp.next;
                prev.next = nextNode;
                if (nextNode != null) {
                    nextNode.pre = prev;
                }
            }
            temp = temp.next;
        }
        head = dummy.next;
        if (head != null) {
            head.pre = null;
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
        deleteAllOccurrences obj = new deleteAllOccurrences();
        obj.head = new Node(1);

        Node n2 = new Node(2);
        obj.head.next = n2;
        n2.pre = obj.head;

        Node n3 = new Node(3);
        n2.next = n3;
        n3.pre = n2;

        Node n4 = new Node(1);
        n3.next = n4;
        n4.pre = n3;

        Node n5 = new Node(4);
        n4.next = n5;
        n5.pre = n4;
        obj.head = obj.deleteAllOccurrences(obj.head, 1);
        obj.display();

    }
}
