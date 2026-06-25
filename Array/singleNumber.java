package Array;

public class singleNumber {
    public static int singleNumber(int arr[]) {
        int xor = 0;
        for (int i : arr) {
            xor = xor ^ i;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4, 3, 1, 4 };
        System.out.println(singleNumber(nums));

    }
}
