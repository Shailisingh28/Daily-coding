package stack_queue.Queue;

public class LLimplofQueue {
    Node head;

    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node temp = head;

    public void add(int element) {
        Node newnNode = new Node(element);
        if (head == null) {
            head = newnNode;
            temp = head;
            return;
        }
        temp.next = newnNode;
        temp = temp.next;
    }

    public int remove() {
        if (head == null) {
            throw new RuntimeException("Empty LinkedList");
        }
        int top = head.val;
        head = head.next;
        return top;
    }

    public int peek() {
        if (head == null) {
            throw new RuntimeException("Empty LinkedList");
        }
        return head.val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LLimplofQueue queue = new LLimplofQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        // queue.display();
        // queue.remove();
        // queue.display();
        System.out.println(queue.peek());

    }
}
