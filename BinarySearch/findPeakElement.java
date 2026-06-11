package BinarySearch;

public class findPeakElement {
    public static int findPeakElement(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1 };
        System.out.println(findPeakElement(arr));
    }
}
