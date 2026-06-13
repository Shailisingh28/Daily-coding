package BinarySearch;

public class shipWithinDays {
    public static int shipWithinDays(int arr[], int days) {
        int max = 0;
        int sum = 0;
        for (int i : arr) {
            if (i > max)
                max = i;
            sum += i;
        }
        int left = max;
        int right = sum;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (allowed(arr, days, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean allowed(int arr[], int days, int mid) {
        int weights = 0;
        int day = 0;
        for (int i : arr) {
            if (i > mid) {
                return false;
            }
            if (weights + i <= mid) {
                weights += i;
            } else {
                weights = i;
                day++;
                if (day > days) {
                    return false;
                }
            }
        }
        return ++day <= days;
    }

    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 1, 1 };
        int days = 4;
        System.out.println(shipWithinDays(weights, days));
    }
}
