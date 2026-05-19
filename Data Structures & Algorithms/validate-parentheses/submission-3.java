class Solution {

    public boolean isValid(String s) {
      Stack<Character> stack = new Stack<>();
      HashMap<Character, Character> cmap = new HashMap<>();
      cmap.put('}', '{');
      cmap.put(']', '[');
      cmap.put(')', '(');
      for(char c : s.toCharArray())
      {
        if(cmap.containsKey(c))
        {
        if(!stack.isEmpty() && stack.peek() == cmap.get(c)){
            stack.pop();
        }
        else{
            return false;
        }
        }
        else{
            stack.push(c);
        }
       
      }

      return stack.isEmpty();
    }
}
