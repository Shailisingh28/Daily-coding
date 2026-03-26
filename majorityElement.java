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
        count = 0;
        for (int e : arr) {
            if (candidate == e) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            return candidate;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 3, 2 };
        System.out.println(majorityElement(arr));
    }
}
