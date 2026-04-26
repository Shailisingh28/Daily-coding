package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsequencewithsumkII {
    public static List<List<Integer>> subsequence(int arr[], int k) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        generate(arr, 0, 0, k, new ArrayList<>(), result);
        return result;
    }

    public static boolean generate(int arr[], int index, int sum, int k, List<Integer> ans,
            List<List<Integer>> result) {
        if (sum == k) {
            result.add(new ArrayList(ans));
            return true;
        }
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            if (sum + arr[i] > k) {
                break;
            }
            sum += arr[i];
            ans.add(arr[i]);
            if (generate(arr, i + 1, sum, k, ans, result)) {
                return true;
            }
            ans.remove(ans.size() - 1);
            sum -= arr[i];
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int k = 3;
        System.out.println(subsequence(arr, k));
    }
}
