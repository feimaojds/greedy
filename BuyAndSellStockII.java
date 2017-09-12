package leecode;

public class BuyAndSellStockII {
public int maxProfit(int[] prices) {
      int benefit = 0;
      for(int i=0;i<prices.length-1;i++){
    	  if(prices[i]<prices[i+1]) benefit = benefit +prices[i+1]-prices[i]; 
      }
    	  return benefit;
    }

}
