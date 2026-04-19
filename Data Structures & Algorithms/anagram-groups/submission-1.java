class Solution {
    private List<List<String>> stringSorting(String[] strs, Map<String, List<String>> res)
    {
        for(String s : strs)
        {
            char[] charArray = s.toCharArray(); 
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            res.putIfAbsent(sortedString, new ArrayList<>());
            res.get(sortedString).add(s);

        }

        return new ArrayList<>(res.values());
    }

    private List<List<String>> characterFrequency(String[] strs, Map<String, List<String>> res)
    {
        for (String s : strs)
        {
            int[] count = new int[26];
            for (char c : s.toCharArray())
            {                
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        // Solution 1. 

        // Construct a hashmap { string : List<string> } 
        Map<String, List<String>> res = new HashMap<>();

        // return stringSorting(strs,res);

        return characterFrequency(strs, res);

        
    }
}
