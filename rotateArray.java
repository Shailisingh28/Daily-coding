import java.util.Arrays;

public class rotateArray {
    public static void rotateArray(int arr[], int k) {
        if (k > arr.length) {
            k = k % arr.length;
        }
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - k + 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 5, 3, -5 };
        int k = 8;
        rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
