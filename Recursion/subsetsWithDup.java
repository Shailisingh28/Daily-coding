package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsWithDup {
    public static List<List<Integer>> subsetsWithDup(int arr[]) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        generate(arr, 0, new ArrayList<>(), result);
        return result;
    }

    public static void generate(int arr[], int index, List<Integer> ans, List<List<Integer>> result) {

        result.add(new ArrayList(ans));
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            ans.add(arr[i]);
            generate(arr, i + 1, ans, result);
            ans.remove(ans.size() - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2 };
        System.out.println(subsetsWithDup(arr));
    }
}
