public class missingNumber {
    public static int missingNumber(int arr[]) {
        int n = arr.length;
        int total = (n * (n + 1)) / 2;
        int given = 0;
        for (int e : arr) {
            given += e;
        }
        return total - given;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 4, 2, 5 };
        System.out.println(missingNumber(arr));
    }
}
