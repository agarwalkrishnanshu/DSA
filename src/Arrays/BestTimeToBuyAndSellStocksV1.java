/*
    Problem: You are given an array prices where prices[i] is the price of a given stock on the ith day.
    URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    This is an optimized solution for this problem.
    Brute Force Approach in BestTimeToBuyAndSellStocks.java
*/
package Arrays;

public class BestTimeToBuyAndSellStocksV1 {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }    
}
