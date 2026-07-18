class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int maxP = 0;
        while( i < j && j < prices.length)
        {
            if(prices[j] < prices[i])
            {
                i = j;
            }
            else
            {
                maxP = Math.max(prices[j] - prices[i], maxP);
            }
            j++;
            
        }
        return maxP;
    }
}
