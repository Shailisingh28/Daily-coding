package BinarySearch;

import java.util.Arrays;

public class aggressiveCows {
    public static int aggressiveCows(int arr[], int k) {
        Arrays.sort(arr);
        int left = 1;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        int right = max - min;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (possible(arr, k, mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;

    }

    public static boolean possible(int arr[], int k, int mid) {
        int count = 1;
        int last = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= mid) {
                count++;
                last = arr[i];
            }
        }
        if (count >= k)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int k = 2;
        int[] nums = { 4, 2, 1, 3, 6 };
        System.out.println(aggressiveCows(nums, k));
    }
}
