public class removeDuplicates {
    public static int removeDuplicates(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 2, 2 };
        System.out.println(removeDuplicates(nums));
    }
}
