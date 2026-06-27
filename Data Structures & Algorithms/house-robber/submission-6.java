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
        HashMap<Integer, Integer> dp = new HashMap<>();
        return dfs(0, nums, dp);


    }
}
