package Array.PrefixSum;

import java.util.HashMap;

public class LC523 {
    public static boolean checkSubarraySum(int arr[], int k) {
        int prefix = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            int remainder = prefix % k;
            if (map.containsKey(remainder)) {
                if (i - map.get(remainder) >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 23, 2, 6, 4, 7 };
        int k = 13;
        System.out.println(checkSubarraySum(nums, k));
    }
}
