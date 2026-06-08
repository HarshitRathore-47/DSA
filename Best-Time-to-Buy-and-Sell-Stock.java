1class Solution {
2    public int maxProfit(int[] prices) {
3        int maxProfit = 0;
4        int minPrice = Integer.MAX_VALUE;
5
6        for (int i = 0; i < prices.length; i++) {
7            if (prices[i] < minPrice) {
8                minPrice = prices[i];
9            } else if (prices[i] - minPrice > maxProfit) {
10                maxProfit = prices[i] - minPrice;
11            }
12
13        }
14        return maxProfit;
15    }
16}