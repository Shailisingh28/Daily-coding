public class stockpart4 {
    public static int stockpart4(int arr[], int i, boolean buy, int cap) {
        int profit = 0;
        if (arr.length == i || cap == 0) {
            return 0;
        }
        if (buy) {
            int take = -arr[i] + stockpart4(arr, i + 1, false, cap);
            int skip = stockpart4(arr, i + 1, true, cap);
            profit = Math.max(take, skip);
        } else {
            int take = arr[i] + stockpart4(arr, i + 1, true, cap - 1);
            int skip = stockpart4(arr, i + 1, false, cap);
            profit = Math.max(take, skip);
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int k = 4;
        System.out.println(stockpart4(arr, 0, true, k));
    }
}
