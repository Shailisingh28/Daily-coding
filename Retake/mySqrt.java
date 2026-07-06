package Retake;

public class mySqrt {
    public static int mySqrt(int x) {
        int left = 1;
        int right = x;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            long sqrt = (long) mid * mid;
            if (sqrt == x)
                return mid;
            else if (sqrt > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }
}
