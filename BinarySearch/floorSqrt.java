package BinarySearch;

public class floorSqrt {
    public static int floorSqrt(int n) {
        int left = 1;
        int right = n;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            long sqr = (long) mid * mid;
            if (sqr == n)
                return mid;
            else if (sqr > n)
                right = mid - 1;
            else {
                left = mid + 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println(floorSqrt(n));
    }
}
