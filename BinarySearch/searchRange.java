package BinarySearch;

import java.util.Arrays;

public class searchRange {
    public static int[] searchRange(int arr[], int target) {
        return new int[] { range(arr, target, true), range(arr, target, false) };

    }

    public static int range(int arr[], int target, boolean isstart) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        int ans = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (isstart) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
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
