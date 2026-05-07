class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int res = 0;
        while( l < r )
        {
            int min_height = Math.min(heights[l], heights[r]);
            int span = r - l ;
            int area = min_height * span;

            res = Math.max(area , res);
            
            if(heights[l] <= heights[r])
            {
                l++;
            }
            else{
                r--;
            }

        }
        return res;
    }
}
