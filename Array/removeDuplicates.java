package Array;

public class removeDuplicates {
    public static int removeDuplicates(int arr[]) {
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 3, 3, 5, 6 };
        System.out.println(removeDuplicates(nums));
    }
}
