package Trees;

public class nthLevel {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void nthLevel(Node root, int n) {
        if (root == null)
            return;
        if (n == 1)
            System.out.print(root.val + " ");
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);
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
        nthLevel(root, 2);
    }
}
