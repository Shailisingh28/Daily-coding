package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsequencewithsumk {
    public static List<List<Integer>> subsequencewithsumk(int arr[], int k) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        generate(arr, 0, new ArrayList<>(), result, 0, k);
        return result;
    }

    public static void generate(int arr[], int index, List<Integer> ans, List<List<Integer>> result, int sum, int k) {
        if (sum == k) {
            result.add(new ArrayList(ans));
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
            generate(arr, i + 1, ans, result, sum, k);
            ans.remove(ans.size() - 1);
            sum -= arr[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1 };
        int k = 2;
        System.out.println(subsequencewithsumk(arr, k));
    }
}
