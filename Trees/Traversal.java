package Trees;

public class Traversal {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
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
        System.out.println("preorder");
        preOrder(root);
        System.out.println();
        System.out.println("Inorder");
        inorder(root);
        System.out.println();
        System.out.println("Postorder");
        postorder(root);
    }

}
