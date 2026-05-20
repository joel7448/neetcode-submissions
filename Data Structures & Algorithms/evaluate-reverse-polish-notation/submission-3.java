class Solution {
    private int helper(int a,int b, String c)
    {
        if(c.equals("+"))
        {
            return a + b;
        }
        else if(c.equals("*"))
        {
            return a * b;
        }
        else if(c.equals("/"))
        {
            return b / a;
        }
        else{
            return b - a;
        }
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int n = tokens.length;
        int i = 0;
        int res = 0;
        while( i < n )
        {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*"))
            {
                res = helper(stack.pop(), stack.pop(), tokens[i]);
                stack.push(res);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
            i++;
        }

        return stack.peek();
    }
}
