package Recursion;

import java.util.ArrayList;
import java.util.List;

public class generateBinaryStrings {
    public static List<String> generateBinaryStrings(int n) {
        List<String> reStrings = generate(n, 0, new StringBuilder(), false, new ArrayList<>());
        return reStrings;
    }

    public static List<String> generate(int n, int i, StringBuilder ans, boolean picked, List<String> result) {
        if (i == n) {
            result.add(ans.toString());
            return result;
        }
        ans.append('0');
        generate(n, i + 1, ans, false, result);
        ans.deleteCharAt(ans.length() - 1);
        if (picked == false) {
            ans.append('1');
            generate(n, i + 1, ans, true, result);
            ans.deleteCharAt(ans.length() - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateBinaryStrings(n));
    }
}
