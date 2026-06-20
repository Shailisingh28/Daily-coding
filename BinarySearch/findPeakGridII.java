package BinarySearch;

import java.util.Arrays;

public class findPeakGridII {
    public static int[] findPeakGridII(int arr[][]) {
        int left = 0;
        int right = arr[0].length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int max = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i][mid] > arr[max][mid]) {
                    max = i;
                }
            }
            int leftVal = mid > 0 ? arr[max][mid - 1] : -1;
            int rightVal = mid < arr[0].length - 1 ? arr[max][mid + 1] : -1;

            if (arr[max][mid] > leftVal && arr[max][mid] > rightVal) {
                return new int[] { max, mid };
            }
            if (leftVal > arr[max][mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] mat = { { 10, 20, 15 }, { 21, 30, 14 }, { 7, 16, 32 } };
        System.out.println(Arrays.toString(findPeakGridII(mat)));
    }
}
