package stack_queue;

import java.util.Arrays;
import java.util.Stack;

public class Removeconsecutivesubseq {
    public static int[] Removeconsecutivesubseq(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            } else {
                if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                    stack.pop();
                }
            }
        }
        int result[] = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2 };
        System.out.println(Arrays.toString(Removeconsecutivesubseq(arr)));
    }
}
