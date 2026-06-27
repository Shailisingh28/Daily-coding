package Array.PrefixSum;

import java.util.HashMap;

public class LC325 {
    public static int maximumlength(int arr[], int k) {
        int prefix = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            int rem = prefix - k;
            if (map.containsKey(rem)) {
                max = Math.max(max, i - map.get(rem));
            }
            map.putIfAbsent(prefix, i);
        }
        return max;

    }

    public static void main(String[] args) {
        int[] nums = { 1, -1, 5, -2, 3 };
        int k = 3;
        System.out.println(maximumlength(nums, k));
    }
}
