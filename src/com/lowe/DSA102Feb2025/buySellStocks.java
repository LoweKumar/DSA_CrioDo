package com.lowe.DSA102Feb2025;

import java.io.*;
import java.util.*;

public class BestTimeToBuyAndSellStocks {
    // Implement your solution Here
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i-1]<prices[i]){
                profit += prices[i]-prices[i-1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] prices = new int[scanner.nextInt()];
        for (int i = 0; i < prices.length; i++)
            prices[i] = scanner.nextInt();
        scanner.close();

        int result = new BestTimeToBuyAndSellStocks().maxProfit(prices);
        System.out.print(Integer.toString(result));
    }
}
