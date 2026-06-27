class Solution {
    public int dfs(int n, int[] nums, HashMap<Integer, Integer> dp)
    {

        if(n >= nums.length)
        {   

            return 0;
        }
        int ans;
        
        if(dp.containsKey(n))
        {
            return dp.get(n);
        }
        else
        {
            ans = Math.max(dfs(n+1, nums, dp), dfs(n+2, nums, dp) + nums[n]);
            dp.put(n, ans);
        }

        return ans;
    }
    public int rob(int[] nums) {
        // nums = [3, 5, 1, 6]
        // HashMap<Integer, Integer> dp = new HashMap<>();
        // return dfs(0, nums, dp);
        int n = nums.length;
        int[] dp = new int[n];
 
        if( n == 1 ) return nums[0];
        

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < n ; i++)
        {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }

        return dp[n - 1];


    }
}
