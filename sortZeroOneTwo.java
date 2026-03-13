import java.util.Arrays;

public class sortZeroOneTwo {
    public static int[] sortZeroOneTwo(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 2, 1, 0 };
        System.out.println(Arrays.toString(sortZeroOneTwo(nums)));
    }
}
