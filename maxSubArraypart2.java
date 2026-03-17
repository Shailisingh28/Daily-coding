import java.util.Arrays;

public class maxSubArraypart2 {
    public static int[] maxSubArraypart2(int arr[]) {
        int start = -1;
        int arrstart = -1;
        int arrend = -1;
        int currentsum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (currentsum == 0) {
                start = i;
            }
            currentsum += arr[i];
            if (currentsum > max) {
                max = currentsum;
                arrstart = start;
                arrend = i;
            }
            if (currentsum < 0) {
                currentsum = 0;
            }
        }
        return Arrays.copyOfRange(arr, arrstart, arrend + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, -2, 7, -4 };
        System.out.println(Arrays.toString(maxSubArraypart2(arr)));
    }
}
