package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countSubsequenceWithTargetSum {
    public static int countSubsequenceWithTargetSum(int arr[], int k) {
        Arrays.sort(arr);
        int count = generate(arr, k, new ArrayList<>(), 0, 0);
        return count;

    }

    public static int generate(int arr[], int k, List<Integer> ans, int index, int sum) {
        int count = 0;
        if (sum == k) {
            return 1;
        }
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1])
                continue;
            if (sum + arr[i] > k) {
                break;
            }
            ans.add(arr[i]);
            sum += arr[i];
            count += generate(arr, k, ans, i + 1, sum);
            ans.remove(ans.size() - 1);
            sum -= arr[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 10, 5, 1, 3 };
        int k = 5;
        System.out.println(countSubsequenceWithTargetSum(nums, k));
    }
}
