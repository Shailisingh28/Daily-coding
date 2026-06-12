package BinarySearch;

public class smallestDivisor {
    public static int smallestDivisor(int arr[], int threshold) {
        int left = 1;
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        int right = max;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (ceiling(arr, mid) <= threshold) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static long ceiling(int arr[], int mid) {
        long result = 0;
        for (int i : arr) {
            result += ((i + mid - 1) / mid);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 9 };
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold));
    }
}
