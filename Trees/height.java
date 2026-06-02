package Trees;

public class height {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static int height(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;
        System.out.println(height(root));
    }
}
