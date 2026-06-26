package Array.PrefixSum;

import java.util.HashMap;

public class LC560Ques {
    public static int subarraySum(int arr[], int k) {
        int prefix = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        for (int i : arr) {
            prefix += i;
            int rem = prefix - k;
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int k = 2;
        System.out.println(subarraySum(nums, k));
    }
}
