package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class checkSubsequenceSum {
    public static boolean checkSubsequenceSum(int arr[], int k) {
        Arrays.sort(arr);
        return generate(arr, k, 0, 0, new ArrayList<>(), false);
    }

    public static boolean generate(int arr[], int k, int index, int sum, List<Integer> ans, boolean res) {
        if (sum == k) {
            return true;
        }
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            if (sum + arr[i] > k) {
                continue;
            }
            ans.add(arr[i]);
            sum += arr[i];
            if (generate(arr, k, i + 1, sum, ans, res)) {
                return true;
            }
            ans.remove(ans.size() - 1);
            sum -= arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 9, 2 };
        int k = 10;
        System.out.println(checkSubsequenceSum(nums, k));

    }
}
