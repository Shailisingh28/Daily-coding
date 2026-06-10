package BinarySearch;

public class findKRotation {
    public static int findKRotation(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (arr[mid] >= arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2, 3 };
        System.out.println(findKRotation(nums));
    }
}
