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
        HashMap<String, List<String>> map =  new HashMap<>();

        for(int i = 0; i < strs.length; i++)
        {
            int[] count = new int[26];
            for(int j = 0 ; j < strs[i].length(); j++)
            {
                count[strs[i].charAt(j) - 'a']++;
            }
            String key = Arrays.toString(count);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(strs[i]);
        }

        return new ArrayList<>(map.values());

        
    }
}
