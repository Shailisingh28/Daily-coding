package BinarySearch;

public class rowWithMax1s {
    public static int rowWithMax1s(int arr[][]) {
        if (arr == null || arr.length == 0)
            return -1;
        int max = 0;
        int index = -1;
        int m = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            int start = BinarySearch(arr[i], 1);
            if (start != -1) {
                int count = m - start;
                if (count > max) {
                    max = count;
                    index = i;
                }
            }
        }
        return index;
    }

    public static int BinarySearch(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        int ans = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = { { 0, 0, 1 }, { 0, 1, 1 }, { 0, 1, 1 } };
        System.out.println(rowWithMax1s(mat));
    }
}
