package stack_queue;

import java.util.Stack;

public class Histogram {
    public static int LargestArea(int arr[]) {
        int smallest[] = nextSmallest(arr);
        int previousSmallest[] = previousSmallest(arr);
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = smallest[i] - previousSmallest[i] - 1;
            max = Math.max(max, arr[i] * width);
        }
        return max;
    }

    public static int[] nextSmallest(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int smallest[] = new int[arr.length];
        for (int i = smallest.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                smallest[i] = smallest.length;
            } else {
                smallest[i] = stack.peek();
            }
            stack.push(i);
        }
        return smallest;
    }

    public static int[] previousSmallest(int arr[]) {
        int previousSmallest[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < previousSmallest.length; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                previousSmallest[i] = -1;
            } else {
                previousSmallest[i] = stack.peek();
            }
            stack.push(i);
        }
        return previousSmallest;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(LargestArea(arr));
    }
}
