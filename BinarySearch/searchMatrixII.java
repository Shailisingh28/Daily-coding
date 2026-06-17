package BinarySearch;

class searchMatrixII {
    public static boolean searchMatrixII(int arr[][], int target) {
        if (arr == null || arr.length == 0 || arr[0].length == 0)
            return false;
        int row = 0;
        int col = arr[0].length - 1;
        while (col >= 0 && row < arr.length) {
            if (arr[row][col] == target)
                return true;
            else if (arr[row][col] < target)
                row++;
            else
                col--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int target = 115;
        System.out.println(searchMatrixII(matrix, target));
    }

}