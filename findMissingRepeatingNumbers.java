import java.util.Arrays;

public class findMissingRepeatingNumbers {
    public static int[] findMissingRepeatingNumbers(int arr[]) {
        int r;
        int m;
        int n = arr.length;
        int s1 = (n * (n + 1)) / 2;
        int s2 = 0;
        for (int e : arr) {
            s2 += e;
        }
        int eq1 = s1 - s2;
        // s1-s2
        int sq_s1 = (n * (n + 1) * ((2 * n) + 1)) / 6;
        int sq_s2 = 0;
        for (int e : arr) {
            sq_s2 += e * e;
        }
        int eq2 = (sq_s1 - sq_s2) / eq1;
        r = (eq1 + eq2) / 2;
        m = (eq1 - eq2) / -2;
        return new int[] { r, m };

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 6, 7, 5, 7 };
        System.out.println(Arrays.toString(findMissingRepeatingNumbers(nums)));
    }
}
