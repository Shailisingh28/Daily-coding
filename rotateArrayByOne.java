import java.util.Arrays;

public class rotateArrayByOne {
    public static void rotateArrayByOne(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 6 };
        rotateArrayByOne(nums);
        System.out.println(Arrays.toString(nums));
    }
}
