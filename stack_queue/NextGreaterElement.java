package stack_queue;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] NextGreaterElement(int arr[]) {
        int result[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 8, 6, 3, 4 };
        System.out.println(Arrays.toString(NextGreaterElement(arr)));
    }
}
