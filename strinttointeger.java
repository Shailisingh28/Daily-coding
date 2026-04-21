public class strinttointeger {
    public static int atoi(String s) {
        s = s.trim();
        return generate(s, 0, 0, 1);
    }

    public static int generate(String s, int i, long ans, int sign) {
        if (i == s.length()) {
            return (int) ans * sign;
        }
        if (i == 0 && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            return generate(s, i + 1, ans, sign);
        }
        if (!Character.isDigit(s.charAt(i))) {
            return (int) ans * sign;
        }
        ans = ans * 10 + (s.charAt(i) - '0');
        if (ans * sign > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (ans * sign < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return generate(s, i + 1, ans, sign);
    }

    public static void main(String[] args) {
        String s = "-1-2b345a";
        System.out.println(atoi(s));
    }
}
