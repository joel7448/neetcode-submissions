class Solution {
    public String encode(List<String> strs) {
        if (strs.size() == 0) {
            return "";
        }

        List<Integer> sizes = new ArrayList<>();
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            sizes.add(s.length());
        }
        for (int size : sizes) {
            res.append(size).append(",");
        }
        res.append("#");
        for (String str : strs) {
            res.append(str);
        }
        System.out.println(res);
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        if (str.length() == 0) {
            return res;
        }

        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder currSize = new StringBuilder();
            while(str.charAt(i) != ',')
            {
                currSize.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(currSize.toString()));
            i++;
        }
        i++; // skip the hash

        for(Integer size : sizes)
        {
            res.add(str.substring(i, i+size));
            i+=size;
        }

        return res;
    }
}
