package Array;

public class secondLargestElement {
    public static int secondLargestElement(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > largest) {
                second_largest = largest;
                largest = i;
            } else if (i != largest && i > second_largest) {
                second_largest = i;
            }
        }
        return second_largest;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 7, 2, 2, 10, 10, 10 };
        System.out.println(secondLargestElement(nums));
    }
}
