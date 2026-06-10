package BinarySearch;

public class singleNonDuplicate {
    public static int searchInDuplicates(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (arr[mid] == arr[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }
        // int ans = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        // ans = ans ^ arr[i];
        // }
        // return ans;
        return arr[left];
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
        System.out.println(searchInDuplicates(nums));
    }
}
