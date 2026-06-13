package BinarySearch;

public class findPages {
    public static int findPages(int arr[], int m) {
        int max = 0;
        int sum = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            sum += i;
        }
        int left = max;
        int right = sum;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (possible(arr, m, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;

    }

    public static boolean possible(int arr[], int m, int mid) {
        int student = 1;
        int pages = 0;
        for (int i : arr) {
            if (i + pages <= mid) {
                pages += i;
            } else {
                student++;
                pages = i;
                if (student > m)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 34, 67, 90 };
        int m = 2;
        System.out.println(findPages(nums, m));
    }
}
