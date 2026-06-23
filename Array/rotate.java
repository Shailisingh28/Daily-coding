package Array;

import java.util.Arrays;

public class rotate {
    public static void rotate(int arr[], int k) {
        k = k % arr.length;
        if (k == 0)
            return;
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { -1, -100, 3, 99 };
        int k = 2;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

}
