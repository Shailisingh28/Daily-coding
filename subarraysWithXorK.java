import java.util.HashMap;

public class subarraysWithXorK {
    public static int subarraysWithXorK(int arr[], int k) {
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // int ans = 0;
        // for (int j = i; j < arr.length; j++) {
        // ans = ans ^ arr[j];
        // if (ans == k) {
        // count++;
        // }
        // }
        // }
        // return count;

        int count = 0;
        int prefixXOR = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            prefixXOR = prefixXOR ^ arr[i];
            if (map.containsKey(prefixXOR ^ k)) {
                count += map.get(prefixXOR ^ k);
            }
            map.put(prefixXOR, map.getOrDefault(prefixXOR, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 2, 6, 4 };
        int k = 6;
        System.out.println(subarraysWithXorK(nums, k));
    }
}