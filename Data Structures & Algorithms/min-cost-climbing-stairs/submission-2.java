class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int a = cost[0];
        int b = cost[1];

        if(n <= 2) return Math.min(a, b);
        
        int c = Math.min(a, b) + cost[2];

        for(int i = 3; i < n; i++ )
        {
            int temp = Math.min(b, c) + cost[i];
            a = b; 
            b = c;
            c = temp;

        }

        return Math.min(c, b);
        // int[] minCost = new int[cost.length+1];

        // minCost[0] = cost[0];
        // minCost[1] = cost[1];
        // int n = cost.length;
        // for(int i = 2; i < cost.length; i++ )
        // {
        //     minCost[i] = Math.min(minCost[i-1], minCost[i-2]) + cost[i];
        // }

        // return Math.min(minCost[n-1], minCost[n-2]);


    }
}
