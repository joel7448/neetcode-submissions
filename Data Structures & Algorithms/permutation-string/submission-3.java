class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s2.length() < s1.length())
        {
            return false;
        }

        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];

        for(int i = 0 ; i < s1.length() ; i++)
        {
            s1Arr[s1.charAt(i) - 'a']++;
            s2Arr[s2.charAt(i) - 'a']++;
        }

        int matches = 0;

        for(int i = 0 ; i < 26; i++)
        {
            if(s1Arr[i] == s2Arr[i])
            {
                matches++;
            }
        }

        int l = 0 ;
        for(int i = s1.length(); i < s2.length(); i++)
        {
            if(matches == 26)
            {
                return true;
            }
            s2Arr[s2.charAt(i) - 'a']++;
            if(s2Arr[s2.charAt(i) - 'a'] == s1Arr[s2.charAt(i) - 'a'])
            {
                matches++;
            }
            else if(s1Arr[s2.charAt(i) - 'a'] + 1 == s2Arr[s2.charAt(i) - 'a'])
            {
                matches--;
            }

            s2Arr[s2.charAt(l) - 'a']--;

            if(s2Arr[s2.charAt(l) - 'a'] == s1Arr[s2.charAt(l) - 'a'])
            {
                matches++;
            }
            else if(s2Arr[s2.charAt(l) - 'a'] == s1Arr[s2.charAt(l) - 'a'] - 1)
            {
                matches--;
            }
            l++;
        }

        return matches == 26;

        
    }
}
