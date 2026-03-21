import java.util.Arrays;

public class nextPermutation {
    public static int[] nextPermutation(int arr[]) {
        int ind = -1;
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            reverse(arr, 0, n - 1);
            return arr;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > arr[ind]) {
                swap(arr, ind, i);
                break;
            }
        }
        reverse(arr, ind + 1, n - 1);
        return arr;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1 };
        System.out.println(Arrays.toString(nextPermutation(nums)));
    }
}