class Solution {
    public int characterReplacement(String s, int k) {
        
        int maxF = 0, res = 0;
        for(int i = 0 ; i < s.length(); i++)
        {
            HashMap<Character, Integer> count = new HashMap<>();
            maxF = 0;
            for(int j = i ; j < s.length(); j++)
            {
                count.put(s.charAt(j), count.getOrDefault(s.charAt(j), 0) + 1);
                maxF = Math.max(count.get(s.charAt(j)), maxF);

                if(( j - i + 1)  - maxF <= k )
                {
                    res = Math.max(j - i + 1 , res);
                }

            }
        }
        return res; 
    }
}
