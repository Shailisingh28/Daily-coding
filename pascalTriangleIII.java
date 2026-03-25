import java.util.ArrayList;
import java.util.List;

public class pascalTriangleIII {
    public static List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(pascalTriangleII(i + 1));
        }
        return result;
    }

    public static List<Integer> pascalTriangleII(int n) {
        List<Integer> list = new ArrayList<>();
        int ans = 1;
        list.add(ans);
        for (int i = 1; i < n; i++)// 3
        {
            ans = ans * (n - i) / i;
            list.add(ans);
        }
        return list;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(pascalTriangleIII(n));
    }
}
