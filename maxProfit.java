public class maxProfit {
    public static int maxProfit(int arr[]) {
        int maxprofit = 0;
        int currentmin = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int profit = arr[i] - currentmin;
            maxprofit = Math.max(maxprofit, profit);
            currentmin = Math.min(currentmin, arr[i]);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(prices));
    }
}
