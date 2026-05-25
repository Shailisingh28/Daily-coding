package stack_queue.Queue;

import java.util.Stack;

public class maximalRectangle {

    public static int maximalRectangle(char arr[][]) {
        int n = arr[0].length;
        int bar[] = new int[n];
        int max = 0;
        for (int i = 0; i < bar.length; i++) {
            bar[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == '1') {
                    bar[j] = bar[j] + 1;
                } else {
                    bar[j] = 0;
                }
            }
            int area = largestRectangleArea(bar);
            max = Math.max(max, area);
        }
        return max;
    }

    public static int largestRectangleArea(int arr[]) {
        int next[] = nextSmaller(arr);
        int pre[] = preSmaller(arr);
        int largestArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int w = next[i] - pre[i] - 1;
            int area = w * arr[i];
            largestArea = Math.max(largestArea, area);
        }
        return largestArea;

    }

    public static int[] preSmaller(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int pre[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                pre[i] = -1;
            } else {
                pre[i] = stack.peek();
            }
            stack.push(i);
        }
        return pre;

    }

    public static int[] nextSmaller(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int next[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                next[i] = arr.length;
            } else {
                next[i] = stack.peek();
            }
            stack.push(i);
        }
        return next;
    }

    public static void main(String[] args) {
        char[][] matrix = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
                { '1', '0', '0', '1', '0' } };
        System.out.println(maximalRectangle(matrix));
    }
}
