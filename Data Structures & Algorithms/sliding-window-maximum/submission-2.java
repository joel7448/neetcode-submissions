class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        int[] res = new int[n-k+1]; 
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0 ; i <= n - k; i++)
        {
            maxNum = Integer.MIN_VALUE;
            for(int j = i ; j < i + k ; j++)
            {
                
                maxNum = Math.max(maxNum, nums[j]);

            }
            res[i] = maxNum;

        }

        return res;
    }
}
