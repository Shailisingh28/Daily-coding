package BinarySearch;

public class upperBound {
    public static int upperBound(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        int ans = arr.length;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3 };
        int x = 21;
        System.out.println(upperBound(nums, x));
    }
}
