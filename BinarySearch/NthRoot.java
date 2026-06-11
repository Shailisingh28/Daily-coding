package BinarySearch;

public class NthRoot {
    public static int NthRoot(int n, int m) {
        int left = 1;
        int right = m;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            long product = 1l;
            for (int i = 1; i <= n; i++) {
                if (product > m / mid) {
                    product = m + 1;
                    break;
                }
                product *= mid;
            }
            if (product == m)
                return mid;
            else if (product > m)
                right = mid - 1;
            else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 69;
        System.out.println(NthRoot(n, m));
    }
}
