package BinarySearch;

public class findMedianSortedArraysI {
    public static double findMedianSortedArraysI(int arr1[], int arr2[]) {
        int smallest[] = arr1.length < arr2.length ? arr1 : arr2;
        int largest[] = arr1.length < arr2.length ? arr2 : arr1;
        int total = arr1.length + arr2.length;
        int left = 0;
        int right = smallest.length;
        while (left <= right) {
            int partition_first = (left + right) / 2;
            int partition_second = ((total + 1) / 2) - partition_first;
            int l1 = partition_first == 0 ? Integer.MIN_VALUE : smallest[partition_first - 1];
            int l2 = partition_second == 0 ? Integer.MIN_VALUE : largest[partition_second - 1];
            int r1 = partition_first == smallest.length ? Integer.MAX_VALUE : smallest[partition_first];
            int r2 = partition_second == largest.length ? Integer.MAX_VALUE : largest[partition_second];
            if (l1 <= r2 && l2 <= r1) {
                if (total % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                }
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                right = partition_first - 1;
            } else {
                left = partition_first + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        System.out.println(findMedianSortedArraysI(nums1, nums2));
    }
}
