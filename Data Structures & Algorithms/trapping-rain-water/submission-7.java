class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int res = 0;   
        if(n == 0)
        {
            return 0;
        }

        int l = 0, r = height.length - 1;
        int leftMax = height[l] , rightMax = height[n-1];
        while( l < r ) 
        {
            if(leftMax < rightMax)
            {
                l++;
                leftMax = Math.max(height[l], leftMax);
                res += leftMax - height[l];

            }
            else
            {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res+= rightMax - height[r];
            }
        }

        return res;
    }
}
