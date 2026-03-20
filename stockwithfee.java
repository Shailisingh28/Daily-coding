public class stockwithfee {
    public static int stockwithfee(int arr[], int i, boolean buy, int fee) {
        int profit = 0;
        if (i == arr.length) {
            return 0;
        }
        if (buy) {
            int take = -arr[i] + stockwithfee(arr, i + 1, false, fee);
            int skip = stockwithfee(arr, i + 1, true, fee);
            profit = Math.max(take, skip);
        } else {
            int take = (arr[i] - fee) + stockwithfee(arr, i + 1, true, fee);
            int skip = stockwithfee(arr, i + 1, false, fee);
            profit = Math.max(take, skip);
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int fee = 2;
        System.out.println(stockwithfee(arr, 0, true, fee));
    }
}
