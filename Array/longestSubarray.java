package Array;

import java.util.HashMap;

public class longestSubarray {
    public static int longestSubarray(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefix = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            int remaining = prefix - k;
            if (map.containsKey(remaining)) {
                max = Math.max(max, i - map.get(remaining));
            }
            map.putIfAbsent(prefix, i);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { -3, 2, 1 };
        int k = 6;
        System.out.println(longestSubarray(nums, k));
    }
}
