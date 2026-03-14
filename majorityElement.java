public class majorityElement {
    public static int majorityElement(int arr[]) {
        int count = 0;
        int candidate = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 3 };
        System.out.println(majorityElement(arr));

    }
}
