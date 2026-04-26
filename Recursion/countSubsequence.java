package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countSubsequence {
    public static int countSubsequence(int arr[], int k) {
        Arrays.sort(arr);
        return generate(arr, k, 0, new ArrayList<>(), 0);
    }

    public static int generate(int arr[], int k, int index, List<Integer> ans, int sum) {
        int count = 0;// locally each level will have its own count
        if (!ans.isEmpty() && k == sum) {
            return 1;
        }
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            if (sum + arr[i] > k) {
                break;
            }
            ans.add(arr[i]);
            sum += arr[i];
            count += generate(arr, k, i + 1, ans, sum);
            ans.remove(ans.size() - 1);
            sum -= arr[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2 };
        int k = 2;
        System.out.println(countSubsequence(arr, k));
    }
}
