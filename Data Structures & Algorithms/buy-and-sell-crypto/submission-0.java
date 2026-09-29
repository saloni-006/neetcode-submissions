class Solution {
    public int maxProfit(int[] prices) {
         int minPrice = Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i=0; i<prices.length;i++)
        {
            minPrice=Math.min(minPrice,prices[i]);
            int profit=prices[i]-minPrice;
            MaxProfit=Math.max(MaxProfit,profit);
        }
        return MaxProfit;
    }
}
