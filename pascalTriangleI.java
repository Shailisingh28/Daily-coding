public class pascalTriangleI {
    public static int pascalTriangleI(int r, int c) {
        int row = r - 1;
        int col = c - 1;
        int res = 1;
        if (col == 0) {
            return res;
        }
        for (int i = 0; i < col; i++) {
            res *= row - i;
            res = res / (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int r = 5;
        int c = 3;
        System.out.println(pascalTriangleI(r, c));
    }
}
