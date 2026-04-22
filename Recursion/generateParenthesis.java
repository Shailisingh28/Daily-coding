package Recursion;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    public static List<String> generateParenthesis(int n) {
        return generate(n, 0, 0, 0, new ArrayList<>(), new StringBuilder());
    }

    public static List<String> generate(int n, int i, int open, int close, List<String> result, StringBuilder ans) {
        if (ans.length() == 2 * n) {
            result.add(ans.toString());
            return result;
        }
        if (open < n) {
            generate(n, i + 1, open + 1, close, result, ans.append('('));
            ans.deleteCharAt(ans.length() - 1);
        }
        if (close < open) {
            generate(n, i + 1, open, close + 1, result, ans.append(')'));
            ans.deleteCharAt(ans.length() - 1);

        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }
}
