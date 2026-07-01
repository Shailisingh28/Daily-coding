package Retake;

public class searchII {
    public static boolean searchII(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return true;
            if (arr[left] == arr[mid] && arr[mid] == arr[right]) {
                left++;
                right--;
            } else if (arr[left] <= arr[mid]) {
                if (arr[left] <= target && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (arr[mid] < target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1, 1 };
        int target = 0;
        System.out.println(searchII(nums, target));
    }
}
