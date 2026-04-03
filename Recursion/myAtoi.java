package Recursion;

public class myAtoi {
    public static int myAtoi(String s) {
        s = s.trim();
        return generate(s, 0, 0, 1);
    }

    public static int generate(String s, long ans, int i, int sign) {
        if (i == s.length()) {
            return (int) (ans * sign);
        }
        if (i == 0 && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            return generate(s, ans, i + 1, sign);
        }

        else if (!Character.isDigit(s.charAt(i))) {
            return (int) (ans * sign);
        }

        else if (Character.isDigit(s.charAt(i))) {
            ans = ans * 10 + (s.charAt(i) - '0');
            if (ans * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (ans * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return generate(s, ans, i + 1, sign);
    }

    public static void main(String[] args) {
        String s = "-y";
        System.out.println(myAtoi(s));
    }
}
