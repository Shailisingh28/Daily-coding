public class SLL {
    Node head;
    int size = 0;

    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void addfirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addlast(int val) {
        Node newnNode = new Node(val);
        if (head == null) {
            head = newnNode;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnNode;
        size++;
    }

    public void addatanyposition(int val, int i) {
        if (i < 0 || i > size) {
            System.out.println("invalid index");
            // System.exit(0);
            return;
        }
        if (i == 0) {
            addfirst(val);
            return;
        }
        if (i == size) {
            addlast(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int j = 0; j < i - 1; j++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void deleteatfirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteatlast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    public void deleteatanyposition(int i) {
        if (i < 0 || i >= size) {
            System.out.println("invalid index passed");
            System.exit(0);
            return;
        }
        if (i == 0) {
            deleteatfirst();
            return;
        } else if (i == size - 1) {
            deleteatlast();
            return;
        }
        Node temp = head;
        for (int j = 0; j < i - 1; j++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
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
        SLL list = new SLL();
        list.addlast(3);
        list.addlast(2);
        list.addlast(1);
        list.addlast(4);
        list.deleteatanyposition(2);
        list.deleteatfirst();
        list.deleteatlast();
        list.deleteatanyposition(0);
        // list.addatanyposition(5, 8);
        list.display();
    }
}
