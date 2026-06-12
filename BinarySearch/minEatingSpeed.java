package BinarySearch;

public class minEatingSpeed {
    public static int minEatingSpeed(int arr[], int h) {
        int left = 1;
        int max = 0;
        for (int i : arr) {
            max = Math.max(i, max);
        }
        int right = max;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int total = total(arr, mid);
            if (total <= h) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static int total(int arr[], int mid) {
        int hour = 0;
        for (int i : arr) {
            hour += (i + mid - 1) / mid;
        }
        return hour;
    }

    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }
}
