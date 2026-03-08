import java.util.Arrays;

public class unionArray {
    public static int[] unionArray(int arr1[], int arr2[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        int arr[] = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                arr[k] = arr1[i];
                i++;
                j++;
                k++;
            } else if (arr1[i] > arr2[j]) {
                arr[k] = arr2[j];
                j++;
                k++;
            } else {
                arr[k] = arr1[i];
                i++;
                k++;
            }
        }
        while (i < arr1.length) {
            arr[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return Arrays.copyOf(arr, k);
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4, 5 };
        int[] nums2 = { 1, 2, 7 };
        System.out.println(Arrays.toString(unionArray(nums1, nums2)));

    }
}
