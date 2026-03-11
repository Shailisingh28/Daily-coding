import java.util.HashMap;

public class subarraysDivByK {
    public static int subarraysDivByK(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefix = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            int rem = prefix % k;
            if (rem < 0) {
                rem += k;
            }
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 2, 9 };
        int k = 2;
        System.out.println(subarraysDivByK(nums, k));
    }
}
