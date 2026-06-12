package BinarySearch;

public class minDays {
    public static int minDays(int arr[], int m, int k) {
        if ((long) m * k > arr.length)
            return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        int left = min;
        int right = max;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (canUse(arr, m, k, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean canUse(int arr[], int m, int k, int mid) {
        int consecutive = 0;
        int bouquet = 0;
        for (int i : arr) {
            if (i <= mid) {
                consecutive++;
                if (consecutive == k) {
                    bouquet++;
                    consecutive = 0;
                    if (bouquet >= m)
                        return true;
                }
            } else {
                consecutive = 0;
            }
        }
        return bouquet >= m;

    }

    public static void main(String[] args) {
        int[] bloomDay = { 1, 10, 3, 10, 2 };
        int m = 3;
        int k = 2;
        System.out.println(minDays(bloomDay, m, k));
    }
}
