class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = prices[0];
        int Maxprofit=0;

        for(int i =1;i<prices.length;i++){
               if(prices[i] <buyprice){
                buyprice = prices[i];
               }

               int profit = prices[i] -buyprice;

               if(profit > Maxprofit){
                  Maxprofit = profit;
               }
        }
        return Maxprofit;
    }
}
