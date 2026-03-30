public class numberOfInversions {
    public static int numberOfInversions(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { -10, -5, 6, 11, 15, 17 };
        System.out.println(numberOfInversions(nums));
    }
}
