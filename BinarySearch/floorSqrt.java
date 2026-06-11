package BinarySearch;

public class floorSqrt {
    public static int floorSqrt(int n) {
        int left = 1;
        int right = n;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mid * mid == n)
                return mid;
            else if (mid * mid > n)
                right = mid - 1;
            else {
                left = mid + 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int n = 36;
        System.out.println(floorSqrt(n));
    }
}
