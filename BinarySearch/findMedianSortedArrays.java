package BinarySearch;

public class findMedianSortedArrays {
    public static double findMedianSortedArrays(int arr1[], int arr2[]) {
        int smaller[] = arr1.length < arr2.length ? arr1 : arr2;
        int largest[] = arr1.length < arr2.length ? arr2 : arr1;
        int totalLen = smaller.length + largest.length;
        int left = 0;
        int right = smaller.length;
        int mid;
        while (left <= right) {
            int left_partition = (left + right) / 2;
            int right_partition = (totalLen + 1) / 2 - left_partition;
            int l1 = left_partition == 0 ? Integer.MIN_VALUE : smaller[left_partition - 1];
            int l2 = right_partition == 0 ? Integer.MIN_VALUE : largest[right_partition - 1];
            int r1 = left_partition == smaller.length ? Integer.MAX_VALUE : smaller[left_partition];
            int r2 = right_partition == largest.length ? Integer.MAX_VALUE : largest[right_partition];
            if (l1 <= r2 && l2 <= r1) {
                if (totalLen % 2 == 0) {
                    return ((Math.max(l1, l2)) + (Math.min(r1, r2))) / 2.0;
                } else {
                    return Math.max(l1, l2);
                }
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
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

}
