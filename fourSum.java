import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
    public static List<List<Integer>> fourSum(int arr[], int target) {
        int k, l;
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < arr.length - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                k = j + 1;
                l = arr.length - 1;
                while (k < l) {
                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum == target) {
                        List<Integer> ans = new ArrayList<>();
                        ans.add(arr[i]);
                        ans.add(arr[j]);
                        ans.add(arr[k]);
                        ans.add(arr[l]);
                        result.add(ans);
                        while (k < l && arr[k] == arr[k + 1]) {
                            k++;
                        }
                        while (k < l && arr[l] == arr[l - 1]) {
                            l--;
                        }
                        k++;
                        l--;
                    } else if (sum > target) {
                        l--;
                    } else {
                        k++;
                    }
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1000000000, 1000000000, 1000000000, 1000000000 };
        int target = -294967296;
        System.out.println(fourSum(nums, target));
    }
}
