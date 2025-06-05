package week1.arrays;

public class BuySellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 3, 6, 1, 8, 5};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    public static int maxProfit(int[] prices) {
        int profit = 0, min = Integer.MAX_VALUE;
        for(int price: prices) {
            if(price < min) {
                min = price;
            } else {
                profit = Math.max(profit, price - min);
            }
        }
        return profit;

    }
}
