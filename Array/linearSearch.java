package Array;

class linearSearch {
    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5, 3 };
        int target = 30;
        System.out.println(linearSearch(nums, target));
    }
}