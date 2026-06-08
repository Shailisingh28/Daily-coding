package BinarySearch;

import java.util.Arrays;

public class getFloorAndCeil {
    public static int[] getFloorAndCeil(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        int floor = -1;
        int ceil = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return new int[] { arr[mid], arr[mid] };
            } else if (arr[mid] < target) {
                floor = arr[mid];
                left = mid + 1;
            } else {
                ceil = arr[mid];
                right = mid - 1;
            }
        }
        return new int[] { floor, ceil };

        // return new int[] { floor(arr, target), ceil(arr, target) };
    }

    // public static int floor(int arr[], int target) {
    // int left = 0;
    // int right = arr.length - 1;
    // int mid;
    // int ans = -1;
    // while (left <= right) {
    // mid = left + (right - left) / 2;
    // if (arr[mid] <= target) {
    // ans = arr[mid];
    // left = mid + 1;
    // } else {
    // right = mid - 1;
    // }
    // }
    // return ans;
    // }

    // public static int ceil(int arr[], int target) {
    // int left = 0;
    // int right = arr.length - 1;
    // int mid;
    // int ans = -1;
    // while (left <= right) {
    // mid = left + (right - left) / 2;
    // if (arr[mid] >= target) {
    // ans = arr[mid];
    // right = mid - 1;
    // } else {
    // left = mid + 1;
    // }
    // }
    // return ans;
    // }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 4, 7, 8, 10 };
        int x = 5;
        // System.out.println(floor(nums, x));
        // System.out.println(ceil(nums, x));
        System.out.println(Arrays.toString(getFloorAndCeil(nums, x)));
    }
}
