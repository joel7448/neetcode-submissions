class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int area = 0;   
        if(n == 0)
        {
            return 0;
        }

        Stack<Integer> s = new Stack<>();

        for( int i=0; i < n ; i++)
        {
            while(!s.isEmpty() && height[s.peek()] <= height[i])
            {
                int valley = height[s.pop()];

                if(!s.isEmpty())
                {
                    int left = height[s.peek()];
                    int right = height[i];

                    int h = Math.min(left, right) - valley;
                    int span = i - s.peek() - 1;
                    area += h * span;
                }

                
            }
            s.push(i);
           
        }
         return area;
    }
}
