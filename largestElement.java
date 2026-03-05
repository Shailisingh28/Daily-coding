public class largestElement {
    public static int largestElement(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int e : arr) {
            if (max < e) {
                max = e;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { -4, -3, 0, -1, -8 };
        System.out.println(largestElement(nums));
    }
}