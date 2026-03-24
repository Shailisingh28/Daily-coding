import java.util.HashMap;

public class prefixsum {
    public static int prefixsum(int arr[], int k) {
        int count = 0;
        int prefix = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            if (map.containsKey(prefix - k)) {
                count += map.get(prefix - k);
            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 4 };
        int k = 6;
        System.out.println(prefixsum(nums, k));
    }
}
