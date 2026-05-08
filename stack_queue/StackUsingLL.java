package stack_queue;

public class StackUsingLL {
    Node head;

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public class CustomStack {
        Node head = null;

        public void push(int element) {
            Node newNode = new Node(element);
            newNode.next = head;
            head = newNode;
        }

        public int peek() {
            if (head == null) {
                throw new RuntimeException("Stack is empty");
            }
            return head.val;
        }

        public int pop() {
            if (head == null) {
                throw new RuntimeException("Stack is empty");
            }
            int top = head.val;
            head = head.next;
            return top;
        }
    }

    public static void main(String[] args) {

    }
}
