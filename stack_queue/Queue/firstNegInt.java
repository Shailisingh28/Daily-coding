package stack_queue.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class firstNegInt {
    public static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                q.add(i);
            }
        }
        for (int i = 0; i <= arr.length - k; i++) {
            while (!q.isEmpty() && q.peek() < i) {
                q.remove();
            }
            if (!q.isEmpty() && q.peek() <= i + k - 1) {
                list.add(arr[q.peek()]);
            } else {
                list.add(0);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { -8, 2, 3, -6, 10 };
        int k = 2;
        System.out.println(firstNegInt(arr, k));
    }
}
