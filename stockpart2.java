public class stockpart2 {
    public static int maxProfit(int arr[], boolean buy, int i) {
        int n = arr.length;
        int profit = 0;
        if (i == n) {
            return 0;
        }
        if (buy) {
            int take = -arr[i] + maxProfit(arr, false, i + 1);
            int skip = maxProfit(arr, true, i + 1);
            profit = Math.max(take, skip);
        } else {
            int take = arr[i] + maxProfit(arr, true, i + 1);
            int skip = maxProfit(arr, false, i + 1);
            profit = Math.max(take, skip);
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(arr, true, 0));
    }
}
