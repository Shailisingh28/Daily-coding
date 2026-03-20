public class stockwithcooldown {
    public static int stockwithcooldown(int arr[], int i, boolean buy) {
        int profit = 0;
        if (arr.length <= i) {
            return 0;
        }
        if (buy) {
            int take = -arr[i] + stockwithcooldown(arr, i + 1, false);
            int skip = stockwithcooldown(arr, i + 1, true);
            profit = Math.max(take, skip);
        } else {
            int take = arr[i] + stockwithcooldown(arr, i + 2, true);
            int skip = stockwithcooldown(arr, i + 1, false);
            profit = Math.max(take, skip);
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(stockwithcooldown(arr, 0, true));

    }
}
