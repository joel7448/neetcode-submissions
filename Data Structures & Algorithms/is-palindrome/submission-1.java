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
    private boolean optimalSol(String s)
    {
        int i = 0;
        int j = s.length() - 1;
        while ( i < j )
        {
            while( i < j && !isValidChar(s.charAt(i)))
            {
                i++;
            }

            while( i < j && !isValidChar(s.charAt(j)) )
            {
                j--;
            }

            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
            {
                return false;
            }

            i++;
            j--;
            
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        // reverse solution
        // return bruteForceSol(s);
        return optimalSol(s);

    }
}
