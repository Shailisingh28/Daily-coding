public class DLList {
    static private node head = null;

    public class node {
        int val;
        node next;
        node pre;

        public node(int val) {
            this.val = val;
        }
    }

    public node insertBeforeHead(node head, int val) {
        node newnNode = new node(val);
        if (head == null) {
            head = newnNode;
            return head;
        }
        newnNode.next = head;
        head.pre = newnNode;
        head = newnNode;
        return head;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        DLList list = new DLList();
        int val = 10;
        head = list.insertBeforeHead(head, 3);
        head = list.insertBeforeHead(head, 2);
        // head = list.insertBeforeHead(head, 5);
        head = list.insertBeforeHead(head, val);
        list.display();
    }
}
