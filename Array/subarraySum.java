package Array;

import java.util.HashMap;

public class subarraySum {
    public static int subarraySum(int arr[], int k) {
        int prefix = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i : arr) {
            prefix += i;
            int remaining = prefix - k;
            if (map.containsKey(remaining)) {
                count += map.get(remaining);
            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }
}
