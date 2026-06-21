package Array;

public class largestElement {
    public static int largestElement(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 3, 0, 99, -40 };
        System.out.println(largestElement(nums));
    }
}
