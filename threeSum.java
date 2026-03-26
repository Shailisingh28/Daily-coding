import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static List<List<Integer>> threeSum(int arr[]) {
        int j, k;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            j = i + 1;
            k = arr.length - 1;
            while (j < k) {
                int threeSum = arr[i] + arr[j] + arr[k];
                if (threeSum == 0) {
                    List<Integer> ans = new ArrayList<>();
                    ans.add(arr[i]);
                    ans.add(arr[j]);
                    ans.add(arr[k]);
                    result.add(ans);
                    while (j < k && arr[j] == arr[j + 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                } else if (threeSum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }
}
