package BinarySearch;

public class countOccurrences {
    public static int countOccurrences(int arr[], int target) {
        int start = range(arr, target, true);
        int end = range(arr, target, false);
        if (start == -1 || end == -1) {
            return 0;
        }
        return end - start + 1;

    }

    public static int range(int arr[], int target, boolean isfind) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        int ans = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (isfind) {
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
        int[] arr = { 5, 5, 5, 5, 5, 5 };
        int target = 15;
        System.out.println(countOccurrences(arr, target));
    }
}
