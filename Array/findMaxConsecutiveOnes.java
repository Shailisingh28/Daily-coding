package Array;

public class findMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int arr[]) {
        int count = 0;
        int max = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 0, 1, 1, 1, 0 };
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
