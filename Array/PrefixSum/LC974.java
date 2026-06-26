package Array.PrefixSum;

import java.util.HashMap;

public class LC974 {
    public static int subarraysDivByK(int arr[], int k) {
        int prefix = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i : arr) {
            prefix += i;
            int rem = ((prefix % k) + k) % k;
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 0, -2, -3, 1 };
        int k = 5;
        System.out.println(subarraysDivByK(nums, k));
    }
}
