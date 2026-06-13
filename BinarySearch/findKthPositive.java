package BinarySearch;

public class findKthPositive {
    public static int findKthPositive(int arr[], int k) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] - (mid + 1) < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left + k;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int k = 2;
        System.out.println(findKthPositive(arr, k));
    }
}
