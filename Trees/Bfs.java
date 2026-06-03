package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void Bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            Node temp = queue.peek();
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
            System.out.println(temp.val);
            queue.remove();
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node d = new Node(5);
        root.left = a;
        root.right = d;
        Node b = new Node(3);
        Node c = new Node(4);
        a.left = b;
        a.right = c;
        Node e = new Node(6);
        Node f = new Node(7);
        d.left = e;
        d.right = f;
        Bfs(root);
    }
}
