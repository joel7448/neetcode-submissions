class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        // Left pointer
        int l = 0;
        int streak = 0;
   
        for(int r = 0; r < s.length(); r++)
        {
            
//  s = "zxyzxyz"
           while(set.contains(s.charAt(r)))
           {
             set.remove(s.charAt(l));
             
             l++;
           }
           set.add(s.charAt(r));
           streak = Math.max(r - l + 1, streak);


           

            
            
        }
        return streak;
    
    }
}
