public class rotate {
    public static int[][] rotate(int arr[][]) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = 1; j < n - i; j++) {
                swap(arr, i, j + i);
            }
        }
        for (int i = 0; i < n; i++) {
            reverse(arr[i], 0, n - 1);
        }
        return arr;
    }

    public static void swap(int arr[][], int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(matrix);
        for (int i[] : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
