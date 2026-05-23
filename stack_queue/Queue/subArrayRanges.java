package stack_queue.Queue;

import java.util.Stack;

public class subArrayRanges {
    public static long subArrayRanges(int arr[]) {
        long greatersum = sumSubarrayMax(arr);
        long smallersum = sumSubarrayMins(arr);
        return greatersum - smallersum;

    }

    public static long sumSubarrayMins(int arr[]) {
        int nextSmaller[] = nextSmaller(arr);
        int preSmaller[] = preSmaller(arr);
        long total = 0;
        for (int i = 0; i < arr.length; i++) {
            int next = nextSmaller[i];
            int pre = preSmaller[i];
            long totalsubarray = (long) (next - i) * (i - pre);
            total += (long) (arr[i] * totalsubarray);
        }
        return total;
    }

    public static int[] nextSmaller(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int minimum[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                minimum[i] = arr.length;
            } else {
                minimum[i] = stack.peek();
            }
            stack.push(i);
        }
        return minimum;
    }

    public static int[] preSmaller(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int preminimum[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                preminimum[i] = -1;
            } else {
                preminimum[i] = stack.peek();
            }
            stack.push(i);
        }
        return preminimum;
    }

    public static long sumSubarrayMax(int arr[]) {
        int nextGreater[] = nextGreater(arr);
        int preGreater[] = preGreater(arr);
        long total = 0;
        for (int i = 0; i < arr.length; i++) {
            int next = nextGreater[i];
            int pre = preGreater[i];
            long totalsubarray = (long) (next - i) * (i - pre);
            total += (arr[i] * totalsubarray);
        }
        return total;
    }

    public static int[] nextGreater(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int nextMax[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextMax[i] = arr.length;
            } else {
                nextMax[i] = stack.peek();
            }
            stack.push(i);
        }
        return nextMax;
    }

    public static int[] preGreater(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int preGreater[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                preGreater[i] = -1;
            } else {
                preGreater[i] = stack.peek();
            }
            stack.push(i);
        }
        return preGreater;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 3 };
        System.out.println(subArrayRanges(nums));
    }
}
