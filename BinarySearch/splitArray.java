package BinarySearch;

public class splitArray {
    public static int splitArray(int arr[], int k) {
        if (k > arr.length) {
            return -1;
        }
        int max = 0;
        int sum = 0;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
            sum += i;
        }
        int left = max;
        int right = sum;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (possible(arr, k, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean possible(int arr[], int k, int mid) {
        int count = 1;
        int sum = 0;
        for (int i : arr) {
            if (sum + i <= mid) {
                sum += i;
            } else {
                sum = i;
                count++;
                if (count > k) {
                    return false;
                }
            }
        }
        return count <= k;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 10, 8 };
        int k = 2;
        System.out.println(splitArray(nums, k));
    }

}
