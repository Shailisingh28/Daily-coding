package stack_queue;

import java.util.Stack;

public class largestRectangleArea {
    public static int largestRectangleArea(int heights[]) {
        int max = 0;
        int[] right = rightboundary(heights);
        int[] left = leftboundary(heights);
        for (int i = 0; i < heights.length; i++) {
            int area = heights[i] * (right[i] - left[i] - 1);
            max = Math.max(max, area);
        }
        return max;

    }

    public static int[] rightboundary(int heights[]) {
        Stack<Integer> smallestRight = new Stack<>();
        int right[] = new int[heights.length];
        // int j=right.length-1;
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!smallestRight.isEmpty() && heights[i] <= heights[smallestRight.peek()]) {
                smallestRight.pop();
            }
            if (smallestRight.isEmpty()) {
                right[i] = heights.length;
            } else {
                right[i] = smallestRight.peek();
            }
            smallestRight.push(i);
        }
        return right;
    }

    public static int[] leftboundary(int heights[]) {
        Stack<Integer> smallestleft = new Stack<>();
        int left[] = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            while (!smallestleft.isEmpty() && heights[i] <= heights[smallestleft.peek()]) {
                smallestleft.pop();
            }
            if (smallestleft.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = smallestleft.peek();
            }
            smallestleft.push(i);
        }
        return left;
    }

    public static void main(String[] args) {
        int[] heights = { 2, 4 };
        System.out.println(largestRectangleArea(heights));
    }
}
