class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int l = 0 , r = 0;
        Set<Character> charSet = new HashSet<>();
        while(r < s.length())
        {
            
            while( l <= r && charSet.contains(s.charAt(r)))
            {
                
                charSet.remove(s.charAt(l));
                l++;
            }
            
            charSet.add(s.charAt(r));
            res = Math.max( r - l + 1 , res );
            r++;
        }

        return res;
    }
}
