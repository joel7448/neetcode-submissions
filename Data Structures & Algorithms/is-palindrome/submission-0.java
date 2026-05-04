class Solution {
    private boolean isValidChar(char a)
    {
        if ( a >= '0' && a <= '9' )
        {
            return true;
        } 
        if( a >= 'a' && a <= 'z' )
        {
            return true;
        } 
        if ( a >= 'A' && a <= 'Z')
        {
            return true;
        }
        return false;
    }
    private boolean bruteForceSol(String s)
    {
        StringBuilder rev_str = new StringBuilder();

        for(char a : s.toCharArray())
        {
            if(isValidChar(a))
            {
                rev_str.append(Character.toLowerCase(a));
            }
        }
        System.out.println(rev_str.reverse());
        return rev_str.toString().equals(rev_str.reverse().toString());
    }
    public boolean isPalindrome(String s) {
        // reverse solution
        return bruteForceSol(s);
    }
}
