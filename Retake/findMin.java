package Retake;

public class findMin {
    public static int findMin(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (arr[mid] < arr[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 2, 0, 1 };
        System.out.println(findMin(nums));
    }
}
