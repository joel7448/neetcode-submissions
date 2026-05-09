class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0 , r = 1;
        int n = prices.length;
        while(r < n)
        {
            if(prices[l] < prices[r])
            {
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(profit, maxProfit);
            }
            else{
                l = r;
            }
            r++;
        }

        return maxProfit;
    }
}
