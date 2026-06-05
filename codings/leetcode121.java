import java.util.Arrays;
class leetcode121 {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        //int[] prices = {7,6,4,3,1};
        System.out.print(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
      /*  int minPrice = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++){
            minPrice = Math.min(minPrice , prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
        }
        return maxProfit; */

        int buy=0,sell=0,profit=0;
        while(sell<prices.length){
            if(prices[buy]<prices[sell]){
                int now=prices[sell]-prices[buy];
                profit=Math.max(now,profit);
            }else{
                buy=sell;
            }
            sell++;
        }
        return profit;

    }
}