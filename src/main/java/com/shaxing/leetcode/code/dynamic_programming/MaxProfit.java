package com.shaxing.leetcode.code.dynamic_programming;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int leftMin = prices[0];
        int maxProfit = 0;
        int profit;
        for (int price : prices) {
            if (leftMin > price) {
                leftMin = price;
                continue;
            }
            profit = price - leftMin;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(new MaxProfit().maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
