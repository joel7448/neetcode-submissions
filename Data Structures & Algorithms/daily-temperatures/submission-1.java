class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<int[]> stack= new Stack<>();

        for(int i = 0 ; i < n ; i++)
        {
            while(!stack.isEmpty() && stack.peek()[0] < temperatures[i])
            {

                res[stack.peek()[1]] = i - stack.peek()[1];
                stack.pop();
            }

            stack.push(new int[] { temperatures[i], i});
        }
        return res;
    }
}
