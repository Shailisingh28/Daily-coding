package Trees;

public class Product {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static int Product(Node root) {
        if (root == null)
            return 1;
        return root.val * Product(root.left) * Product(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(1);
        root.left = a;
        root.right = b;
        Node c = new Node(2);
        Node d = new Node(0);
        a.left = c;
        a.right = d;
        Node e = new Node(1);
        b.right = e;
        System.out.println(Product(root));
    }
}
