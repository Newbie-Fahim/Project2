/*
Buy and sell stocks: We are given an array prices where prices[i] is the price of the 
given stock on the ith day. We want to maximize our profit by choosing a single day
to buy one stock and choosing a different day in the future to sell that stock.
Return the  maximum profit  we can achieve from this transaction. If we cannot 
achieve any profit return 0.
*/
/*  Profit = Selling price - buying price
    var buyPrice = Math.MAX_VALUE;
    To track the lowest buying price
    if: buy price < selling price
        profit = SellingPrice - BuyingPrice;
*/
//Time Complexity: O(n)
import java.util.*;
public class Stocks {
    public static int buySell(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        System.out.print("Profits: ");
        for(int i=0;i<prices.length;i++) {
            if(buyPrice<prices[i]) {//Profit earned
                int profit = prices[i]-buyPrice;
                System.out.print(profit+" ");
                maxProfit = Math.max(profit,maxProfit);
            } else{
                buyPrice = prices[i]; 
            }
        }
        System.out.println();
        return maxProfit;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " elements in array: ");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int profit = buySell(a);
        System.out.println("The maximum profit we can obtain: "+ profit);
        in.close();
    }
}