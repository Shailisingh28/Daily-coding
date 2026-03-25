import java.util.ArrayList;
import java.util.List;

public class pascalTriangleII {
    public static List<Integer> pascalTriangleII(int n) {
        List<Integer> list = new ArrayList<>();
        int ans = 1;
        list.add(ans);
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i) / i;
            list.add(ans);
        }
        return list;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(pascalTriangleII(n));
    }
}
