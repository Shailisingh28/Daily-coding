public class findMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int arr[]) {
        // int count = 0;
        // int max = 0;
        // for (int e : arr) {
        // if (e != 0) {
        // count++;
        // max = Math.max(max, count);
        // } else {
        // count = 0;
        // }
        // }
        // return max;
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < arr.length) {
            if (arr[right] == 1) {
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                if (right + 1 == arr.length) {
                    return max;
                }
                left = right + 1;
                right++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 0 };
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
