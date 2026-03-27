import java.util.HashMap;

public class maxLen {
    public static int maxLen(int arr[]) {
        // int sum = 0;
        // int max = 0;
        // for (int i = 0; i < arr.length; i++) {
        // sum = arr[i];
        // if (sum == 0) {
        // max = Math.max(max, 1);
        // }
        // for (int j = i + 1; j < arr.length; j++) {
        // sum += arr[j];
        // if (sum == 0) {
        // max = Math.max(max, j - i + 1);
        // }
        // }
        // }
        // return max;

        int max = 0;
        int prefix = 0;
        int k = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            if (prefix == 0) {
                max = i + 1;
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
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println(maxLen(arr));
    }
}
