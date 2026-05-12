class Solution {
    public int characterReplacement(String s, int k) {
        
        Set<Character> charSet = new HashSet<>();

        for(char a : s.toCharArray())
        {
            charSet.add(a);
        }

        
        
        int res = 0;
        for(char c : charSet )
        {
            
            int l = 0 , r = 0;
            int maxF = 0;
            while(r < s.length())
            {
                if(s.charAt(r) == c)
                {
                    maxF++;
                }
                
                while( k < ( r - l + 1 ) - maxF)
                {
                    if(s.charAt(l) == c)
                    {
                        maxF--;
                    }
                    l++;
                }
                 res = Math.max( r - l + 1 , res );
                r++;
            }

           
        }
        return res;
    }
}
