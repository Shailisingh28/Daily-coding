package Recursion;

public class myPow {
    public static double myPow(double x, int n) {
        if (n == 0)
            return 1;
        double half = myPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }

    public static void main(String[] args) {
        double x = 2.50000;
        int n = 2;
        int power = n;
        if (n < 0) {
            power = -n;
            System.out.println(1 / myPow(x, power));
        } else {
            System.out.println(myPow(x, power));
        }
    }
}
