package leetcode.array;

import java.util.Arrays;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int price : prices) {
            minPrice = Math.min(minPrice ,price);
            maxProfit = Math.max(maxProfit, price-minPrice);
        }

        return maxProfit;
    }
}
