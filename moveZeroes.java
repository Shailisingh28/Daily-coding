import java.util.Arrays;

public class moveZeroes {
    public static void moveZeroes(int arr[]) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                swap(arr, i, j);
                i++;
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 0 };
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
