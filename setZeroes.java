import java.util.Arrays;

public class setZeroes {
    public static int[][] setZeroes(int arr[][]) {
        int col0 = 1;
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    if (j != 0) {
                        arr[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    if (arr[0][j] == 0 || arr[i][0] == 0) {
                        arr[i][j] = 0;
                    }
                }
            }
        }
        if (arr[0][0] == 0) {
            for (int col = 0; col < m; col++) {
                arr[0][col] = 0;
            }
        }
        if (col0 == 0) {
            for (int row = 0; row < n; row++) {
                arr[row][0] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        setZeroes(matrix);
        for (int i[] : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
