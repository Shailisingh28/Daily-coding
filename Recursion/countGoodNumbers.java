package Recursion;

public class countGoodNumbers {
    static final int MOD = 1_000_000_007;

    public static int countGoodNumbers(int n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        long ans = (power(5, even) * power(4, odd)) % MOD;
        return (int) ans;
    }

    public static long power(long x, long n) {
        if (n == 0) {
            return 1;
        }
        long half = power(x, n / 2);
        if (n % 2 == 0) {
            return (half * half) % MOD;
        } else {
            return (x * half % MOD * half % MOD) % MOD;
        }
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(countGoodNumbers(n));
    }
}
