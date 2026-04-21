public class pow {
    public static double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double half = pow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }

    public static void main(String[] args) {
        double x = 2.000000;
        int n = 10;
        int p = n;
        if (p < 0) {
            p = -(p);
        }
        // if (n < 0) {
        // System.out.println(1 / pow(x, p));
        // } else {
        // System.out.println(pow(x, p));
        // }
        System.out.printf("%.4f\n", n < 0 ? 1 / pow(x, p) : pow(x, p));
    }
}
