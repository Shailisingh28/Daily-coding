package Array;

import java.util.Arrays;

public class moveZeroes {
    public static void moveZeroes(int arr[]) {
        int k = 0;
        for (int i : arr) {
            if (i != 0) {
                arr[k++] = i;
            }
        }
        while (k < arr.length) {
            arr[k++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 20, 0, -20, 0, 20 };
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
