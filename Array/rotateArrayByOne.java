package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class rotateArrayByOne {
    public static void rotateArrayByOne(int arr[]) {
        int x = arr[0];
        int i = 1;
        while (i < arr.length) {
            arr[i - 1] = arr[i];
            i++;
        }
        arr[i - 1] = x;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        rotateArrayByOne(nums);
        System.out.println(Arrays.toString(nums));
    }
}
