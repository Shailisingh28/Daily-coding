import java.util.HashSet;

public class longestConsecutive {
    public static int longestConsecutive(int arr[]) {
        int max = Integer.MIN_VALUE;
        int start = -1;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int e : arr) {
            set.add(e);
        }
        for (int e : set) {
            if (!set.contains(e - 1)) {
                start = e;
                count = 1;
                while (set.contains(start + 1)) {
                    count++;
                    start = start + 1;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 2 };
        System.out.println(longestConsecutive(nums));
    }
}
