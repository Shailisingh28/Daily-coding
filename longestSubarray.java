import java.util.HashMap;

public class longestSubarray {
    public static int subarraySum(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefix = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            if (map.containsKey(prefix - k)) {
                max = Math.max(max, i - map.get(prefix - k));
            }
            map.put(prefix, i);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { -3, 2, 1 };
        int k = 6;
        System.out.println(subarraySum(arr, k));
    }
}
