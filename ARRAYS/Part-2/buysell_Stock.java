import java.util.*;

public class Array {
  public static int buyAndSellStocks(int prices[]) {
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int i =0; i<prices.length; i++) {
      if(buyPrice < prices[i]) {
         //calculate profit 
         int profit = prices[i] - buyPrice; //todays profit 
         maxProfit = Math.max(maxProfit , profit); // sare din ka profit
      } 
      else {
        buyPrice = prices[i];
      }
    }
     return maxProfit;
  }                    

     public static void main(String args[]) {
         int prices[] = { 7, 1, 5 , 3, 6, 4};
         System.out.println(buyAndSellStocks(prices));
    }
}
