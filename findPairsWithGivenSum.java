import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findPairsWithGivenSum {
    Node head;

    public static class Node {
        int val;
        Node next;
        Node pre;

        Node(int val) {
            this.val = val;
        }
    }

    public List<List<Integer>> findPairsWithGivenSum(Node head, int target) {
        if (head == null) {
            return null;
        }
        List<List<Integer>> ans = new ArrayList<>();
        Node left = head;
        Node right = head;
        while (right.next != null) {
            right = right.next;
        }
        int sum = 0;
        while (left != null && right != null && left != right && right.next != left) {
            sum = left.val + right.val;
            if (sum == target) {
                ans.add(Arrays.asList(left.val, right.val));
                left = left.next;
                right = right.pre;
            } else if (sum > target) {
                right = right.pre;
            } else {
                left = left.next;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        findPairsWithGivenSum obj = new findPairsWithGivenSum();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(8);
        Node n7 = new Node(9);

        // forward links
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        // backward links (IMPORTANT)
        n2.pre = n1;
        n3.pre = n2;
        n4.pre = n3;
        n5.pre = n4;
        n6.pre = n5;
        n7.pre = n6;

        Node head = n1;
        List<List<Integer>> result = obj.findPairsWithGivenSum(head, 7);
        System.out.println(result);

    }
}
