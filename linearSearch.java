public class linearSearch {
    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 3, 5, -4, 1 };
        int target = 1;
        System.out.println(linearSearch(nums, target));
    }
}
