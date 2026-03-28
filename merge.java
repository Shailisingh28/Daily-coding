import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge {
    public static int[][] merge(int arr[][]) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        for (int e[] : arr) {
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < e[0]) {
                ans.add(e);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], e[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int ans[][] = merge(intervals);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
