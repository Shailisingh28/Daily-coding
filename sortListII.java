public class sortListII {
    Node head;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node sortListII(Node head) {
        Node dummy0 = new Node(-1);
        Node temp0 = dummy0;
        Node dummy1 = new Node(-1);
        Node temp1 = dummy1;
        Node dummy2 = new Node(-1);
        Node temp2 = dummy2;
        Node temp = head;
        while (temp != null) {
            if (temp.val == 0) {
                temp0.next = temp;
                temp0 = temp;
            } else if (temp.val == 1) {
                temp1.next = temp;
                temp1 = temp;
            } else {
                temp2.next = temp;
                temp2 = temp;
            }
            temp = temp.next;
        }
        temp2.next = null;
        temp0.next = (dummy1.next != null) ? dummy1.next : dummy2.next;
        temp1.next = (dummy2.next != null) ? dummy2.next : null;
        return dummy0.next;
        // int count0 = 0;
        // int count1 = 0;
        // int count2 = 0;

        // Node temp = head;
        // while (temp != null) {
        // if (temp.val == 0) {
        // count0++;
        // } else if (temp.val == 1) {
        // count1++;
        // } else {
        // count2++;
        // }
        // temp = temp.next;
        // }
        // temp = head;
        // for (int i = 0; i < count0; i++) {
        // if (temp.val != 0) {
        // temp.val = 0;
        // }
        // temp = temp.next;
        // }
        // for (int i = 0; i < count1; i++) {
        // if (temp.val != 1) {
        // temp.val = 1;
        // }
        // temp = temp.next;
        // }
        // for (int i = 0; i < count2; i++) {
        // if (temp.val != 2) {
        // temp.val = 2;
        // }
        // temp = temp.next;
        // }
        // return head;
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
        sortListII obj = new sortListII();
        obj.head = new Node(1);
        obj.head.next = new Node(0);
        obj.head.next.next = new Node(1);
        obj.head.next.next.next = new Node(2);
        obj.head.next.next.next.next = new Node(0);
        obj.head.next.next.next.next.next = new Node(2);
        obj.head.next.next.next.next.next.next = new Node(1);
        obj.head = obj.sortListII(obj.head);
        obj.display();
    }
}
