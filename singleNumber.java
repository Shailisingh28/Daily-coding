import java.util.Arrays;

public class singleNumber {
    public static int singleNumber(int arr[]) {
        int i = 0;
        Arrays.sort(arr);
        while (i < arr.length) {
            if (i != arr.length - 1 && arr[i] == arr[i + 1]) {
                i = i + 2;
            } else {
                return arr[i];
            }
        }
        return arr[i];
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4, 3, 1, 4 };
        System.out.println(singleNumber(nums));
    }
}
