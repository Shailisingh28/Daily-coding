package Array;

public class missingNumber {
    public static int missingNumber(int arr[]) {
        int sum = 0;
        int n = arr.length;
        for (int i : arr) {
            sum += i;
        }
        int total = n * (n + 1) / 2;
        return total - sum;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 4, 5, 6 };
        System.out.println(missingNumber(nums));

    }
}
