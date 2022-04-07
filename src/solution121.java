/**
 * 
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * If you were only permitted to complete at most one transaction (i.e., buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 * 
 * Note that you cannot sell a stock before you buy one.
 * 
 * Example 1:
 * 
 * Input: [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2 (price = 1) and sell
 * on day 5 (price = 6), profit = 6-1 = 5. Not 7-1 = 6, as selling price needs
 * to be larger than buying price.
 * 
 * Example 2:
 * 
 * Input: [7,6,4,3,1] Output: 0 Explanation: In this case, no transaction is
 * done, i.e. max profit = 0.
 * 
 * 
 */

public class solution121 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[min])
                min = i;
            else {
                max = Math.max(max, prices[i] - min);
            }
        }
        return max;

        // int max = 0;
        // int buy = prices[0];
        // if (prices.length == 0 || prices.length == 1) {
        // return max;
        // }
        // for (int i = 1; i < prices.length; i++) {
        // int sell = prices[i];
        // if (sell - buy > max) {
        // max = sell - buy;
        // }
        // int currentBuy = prices[i];
        // if (currentBuy < buy) {
        // buy = currentBuy;
        // }
        // }
        // return max;

        // int max = 0;
        // if (prices.length == 0 || prices.length == 1) {
        // return max;
        // }
        // for (int i = 0; i < prices.length; i++) {
        // for (int j = prices.length - 1; j > i; j--) {
        // if (prices[j] - prices[i] > max) {
        // max = prices[j] - prices[i];
        // }
        // }
        // }
        // return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 6, 3, 1, 4, 3 };
        solution121 a = new solution121();
        System.out.println(a.maxProfit(arr));
    }
}