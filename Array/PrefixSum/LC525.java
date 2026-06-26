package Array.PrefixSum;

import java.util.HashMap;

public class LC525 {
    public static int findMaxLength(int arr[]) {
        int prefix = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                prefix += -1;
            } else {
                prefix += arr[i];
            }
            if (map.containsKey(prefix)) {
                max = Math.max(max, i - map.get(prefix));
            } else {
                map.put(prefix, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1 };
        System.out.println(findMaxLength(nums));
    }
}
