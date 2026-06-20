package BinarySearch;

public class findMedian {
    public static int findMedian(int arr[][]) {
        int total = arr.length * arr[0].length;
        int left = 1;
        int right = 2000;
        int k = total / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int countofsmallerlement = findSmaller(arr, mid);
            if (countofsmallerlement <= k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static int findSmaller(int arr[][], int assumedmid) {
        int noOfSmallerElement = 0;
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr[i].length - 1;
            int mid;
            while (left <= right) {
                mid = left + (right - left) / 2;
                if (arr[i][mid] <= assumedmid) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            noOfSmallerElement += left;
        }
        return noOfSmallerElement;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 4, 9 }, { 2, 5, 6 }, { 3, 7, 8 } };
        System.out.println(findMedian(matrix));

    }
}
