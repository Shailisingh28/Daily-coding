package Array;

public class longestSubarray {
    public static int longestSubarray(int arr[], int k) {
        int left = 0;
        int right = 0;
        int max = 0;
        int sum = 0;
        while (right < arr.length) {
            if (sum + arr[right] <= k) {
                sum += arr[right];
                if (sum == k) {
                    max = Math.max(max, right - left + 1);
                }
                right++;
            } else {
                sum = sum - arr[left];
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { -3, 2, 1 };
        int k = 6;
        System.out.println(longestSubarray(nums, k));
    }
}
