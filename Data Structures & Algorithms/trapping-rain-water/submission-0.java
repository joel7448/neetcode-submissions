class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int res = 0;
        for(int i = 0 ; i < n; i++)
        {
            int leftMax = height[i];
            int rightMax = height[i];

            for(int j = 0; j < i ; j++)
            {
                leftMax = Math.max(leftMax, height[j]);
            }

            for(int j = i+1 ; j < n; j++)
            {
                rightMax = Math.max(rightMax, height[j]);
            }
            int boundary_height = Math.min(leftMax, rightMax);
            res += boundary_height - height[i];
        }

        return res;
    }
}
