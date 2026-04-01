public class DLL {
    private Node head;
    private int size;

    public class Node {
        int val;
        Node next;
        Node pre;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next, Node pre) {
            this.val = val;
            this.next = next;
            this.pre = pre;
        }
    }

    public void addfirst(int val) {
        Node newnNode = new Node(val);
        if (head == null) {
            head = newnNode;
            size++;
            return;
        }
        newnNode.next = head;
        head.pre = newnNode;
        head = newnNode;
        size++;
    }

    public void addlast(int val) {
        Node newnNode = new Node(val);
        if (head == null) {
            newnNode.pre = null;
            head = newnNode;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnNode;
        newnNode.pre = temp;
        newnNode.next = null;
        size++;
    }

    public void addatanyposition(int val, int i) {
        if (i < 0 || i > size) {
            System.exit(0);
            return;
        }
        Node newnNode = new Node(val);
        if (i == 0) {
            addfirst(val);
            return;
        }
        if (i == size) {
            addlast(val);
            return;
        }
        Node temp = head;
        for (int j = 0; j < i - 1; j++) {
            temp = temp.next;
        }
        Node nextNode = temp.next;
        newnNode.next = nextNode;
        newnNode.pre = temp;
        temp.next = newnNode;
        nextNode.pre = newnNode;
        size++;
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
        DLL list = new DLL();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.display();
    }
}
