public class countgoodnumber {
    static final int MOD = 1_000_000_007;

    public static int countgoodnumber(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        return (int) ((pow(5, even) * pow(4, odd)) % MOD);
    }

    public static long pow(int x, long n) {
        if (n == 0) {
            return 1;
        }
        long half = pow(x, n / 2);
        return n % 2 == 0 ? (half * half) % MOD : (x * half % MOD * half % MOD) % MOD;
    }

    public static void main(String[] args) {
        long n = 2;
        System.out.println(countgoodnumber(n));

    }
}
