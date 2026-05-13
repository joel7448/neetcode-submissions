class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character , Integer> countS1  = new HashMap<>();
        

        for(int i = 0 ; i < s1.length(); i++ )
        {
            countS1.put(s1.charAt(i), countS1.getOrDefault(s1.charAt(i), 0)+1);
            
        }

        for(int i = 0; i < s2.length(); i++)
        {
            HashMap<Character , Integer> countS2  = new HashMap<>();
            int matches = 0;
            for(int j = i ; j < s2.length(); j++)
            {
                countS2.put(s2.charAt(j), countS2.getOrDefault(s2.charAt(j), 0)+1);

                if(countS2.get(s2.charAt(j)) > countS1.getOrDefault(s2.charAt(j), 0))
                {
                    break;
                }
                if(countS2.get(s2.charAt(j)) == countS1.getOrDefault(s2.charAt(j), 0))
                {
                    matches++;
                }

                if(matches == countS1.size())
            {
                return true;
            }
            }

            
            
        }

        return false;


    }
}
