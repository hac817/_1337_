package easy.buytwochocolates;

import java.util.Arrays;

class Solution {
    public int buyChoco(int[] prices, int money) {
        int leftOver = money;
        Arrays.sort(prices);



        int i = 0, j = 1, n = prices.length;
        while (j <= n - 1) {
            while (i < j && (prices[i] + prices[j]) <= money) {
                leftOver = money - prices[i] - prices[j];
                i++;
            }
            j++;
        }
        return leftOver;
    }
}