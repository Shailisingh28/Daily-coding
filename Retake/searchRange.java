package Retake;

import java.util.Arrays;

public class searchRange {
    public static int[] searchRange(int arr[], int target) {
        int start = BinarySearch(arr, target, true);
        int end = BinarySearch(arr, target, false);
        return new int[] { start, end };
    }

    public static int BinarySearch(int arr[], int target, boolean startindex) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        int ans = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (startindex) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {};
        int target = 0;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
