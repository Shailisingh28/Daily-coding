package BinarySearch;

public class paint {
    public static int paint(int arr[], int k) {
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
                count++;
                sum = i;
                if (count > k) {
                    return false;
                }
            }
        }
        return count <= k;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 30, 20, 15 };
        int k = 3;
        System.out.println(paint(arr, k));
    }
}
