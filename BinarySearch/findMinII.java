package BinarySearch;

public class findMinII {
    public static int findMinII(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == arr[right]) {
                right--;
            } else if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 0, 1 };
        System.out.println(findMinII(arr));
    }
}
