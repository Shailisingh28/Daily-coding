package BinarySearch;

public class lowerBound {
    public static int lowerBound(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        int ans = arr.length;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 5, 8, 15, 19 };
        int x = 29;
        System.out.println(lowerBound(nums, x));
    }
}
