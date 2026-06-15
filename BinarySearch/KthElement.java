package BinarySearch;

public class KthElement {
    public static double KthElement(int arr1[], int arr2[], int k) {
        if (arr1.length > arr2.length)
            return KthElement(arr2, arr1, k);
        int n = arr1.length;
        int m = arr2.length;
        int left = Math.max(0, k - m);
        int right = Math.min(k, n);
        while (left <= right) {
            int left_partition = (left + right) / 2;
            int right_partition = k - left_partition;
            int l1 = left_partition == 0 ? Integer.MIN_VALUE : arr1[left_partition - 1];
            int l2 = right_partition == 0 ? Integer.MIN_VALUE : arr2[right_partition - 1];
            int r1 = left_partition == arr1.length ? Integer.MAX_VALUE : arr1[left_partition];
            int r2 = right_partition == arr2.length ? Integer.MAX_VALUE : arr2[right_partition];
            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);

            }
            if (l1 > r2) {
                right = left_partition - 1;
            } else {
                left = left_partition + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 3, 6, 7, 9 };
        int[] nums2 = { 1, 4, 8, 10 };
        int k = 5;
        System.out.println(KthElement(nums1, nums2, k));
    }

}
