package BinarySearch;

public class minimiseMaxDistance {
    public static double minimiseMaxDistance(int arr[], int k) {
        double left = 0;
        double right = 0;
        for (int i = 1; i < arr.length; i++) {
            right = Math.max(arr[i] - arr[i - 1], right);
        }
        double mid;
        while (right - left > 1e-6) {
            mid = left + (right - left) / 2;
            if (possible(arr, k, mid)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }

    public static boolean possible(int arr[], int k, double mid) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            double gap = arr[i] - arr[i - 1];
            count += (int) (gap / mid);
            if (gap % mid == 0)
                count--;
            if (count > k) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 10;
        System.out.println(minimiseMaxDistance(arr, k));
    }
}
