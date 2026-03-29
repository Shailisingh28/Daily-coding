import java.util.Arrays;

public class mergeSortedArray {
    public static int[] mergeSortedArray(int nums1[], int nums2[], int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (i >= 0) {
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums1[j];
            j--;
            k--;
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1 };
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        System.out.println(Arrays.toString(mergeSortedArray(nums1, nums2, m, n)));
    }
}
