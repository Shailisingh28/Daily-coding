import java.util.Arrays;

public class rearrangeArray {
    public static int[] rearrangeArray(int arr[]) {
        int result[] = new int[arr.length];
        int p = 0;
        int n = 1;
        for (int e : arr) {
            if (e >= 0) {
                result[p] = e;
                p = p + 2;
            } else {
                result[n] = e;
                n = n + 2;
            }
        }
        return result;

        // brute
        // int i = 0;
        // int j = 0;
        // int n = arr.length;
        // int parr[] = new int[n / 2];
        // int narr[] = new int[n / 2];
        // for (int e : arr) {
        // if (e >= 0) {
        // parr[i] = e;
        // i++;
        // } else {
        // narr[j] = e;
        // j++;
        // }
        // }
        // i = 0;
        // j = 0;
        // int result[] = new int[n];
        // for (int k = 0; k < result.length; k++) {
        // if (k % 2 == 0) {
        // result[k] = parr[i];
        // i++;
        // } else {
        // result[k] = narr[j];
        // j++;
        // }
        // }
        // return result;
    }

    public static void main(String[] args) {
        int[] nums = { -4, 4, -4, 0, -4, 4 };
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}
