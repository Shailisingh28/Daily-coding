public class stockpart3 {
    public static int stockpart3(int arr[], int i, boolean buy, int cap) {
        int profit = 0;
        if (arr.length == i || cap == 0) {
            return 0;
        }
        if (buy) {
            int take = -arr[i] + stockpart3(arr, i + 1, false, cap);
            int skip = stockpart3(arr, i + 1, true, cap);
            profit = Math.max(take, skip);
        } else {
            int take = arr[i] + stockpart3(arr, i + 1, true, cap - 1);
            int skip = stockpart3(arr, i + 1, false, cap);
            profit = Math.max(take, skip);
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(stockpart3(arr, 0, true, 2));
    }
}
