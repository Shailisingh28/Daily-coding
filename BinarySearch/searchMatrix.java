package BinarySearch;

public class searchMatrix {
    public static boolean searchMatrix(int arr[][], int target) {
        int n = arr.length;
        int m = arr[0].length;
        int left = 0;
        int right = m * n - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int row = mid / m;
            int col = mid % m;
            if (arr[row][col] == target)
                return true;
            else if (arr[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int target = 98;
        System.out.println(searchMatrix(mat, target));
    }
}
