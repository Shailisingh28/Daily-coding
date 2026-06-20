package BinarySearch;

public class kthElementI {
    public static int kthElementI(int arr1[], int arr2[], int k) {
        int smallest[] = arr1.length < arr2.length ? arr1 : arr2;
        int larger[] = arr1.length < arr2.length ? arr2 : arr1;
        int left = Math.max(0, k - larger.length);
        int right = Math.min(smallest.length, k);
        while (left <= right) {
            int partition_first = (left + right) / 2;
            int partition_second = k - partition_first;
            int l1 = partition_first == 0 ? Integer.MIN_VALUE : smallest[partition_first - 1];
            int r1 = partition_first == smallest.length ? Integer.MAX_VALUE : smallest[partition_first];
            int l2 = partition_second == 0 ? Integer.MIN_VALUE : larger[partition_second - 1];
            int r2 = partition_second == larger.length ? Integer.MAX_VALUE : larger[partition_second];
            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            }
            if (l1 > r2) {
                right = partition_first - 1;
            } else {
                left = partition_first + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 2, 3, 6, 7, 9 };
        int b[] = { 1, 4, 8, 10 };
        int k = 5;
        System.out.println(kthElementI(a, b, k));
    }
}
