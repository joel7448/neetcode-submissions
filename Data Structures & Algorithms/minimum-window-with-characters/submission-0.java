class Solution {
    public String minWindow(String s, String t) {

        if (t.isEmpty()) {
            return "";
        }

        HashMap<Character, Integer> countT = new HashMap<>();
        HashMap<Character, Integer> countS = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            countT.put(
                t.charAt(i),
                countT.getOrDefault(t.charAt(i), 0) + 1
            );
        }

        int have = 0;
        int need = countT.size();

        int windowSize = Integer.MAX_VALUE;
        int windowLeft = 0;
        int windowRight = 0;

        int l = 0;

        for (int r = 0; r < s.length(); r++) {

            char c = s.charAt(r);

            countS.put(
                c,
                countS.getOrDefault(c, 0) + 1
            );

            if (
                countT.containsKey(c) &&
                countS.get(c).equals(countT.get(c))
            ) {
                have++;
            }

            while (have == need) {

                if ((r - l + 1) < windowSize) {
                    windowSize = r - l + 1;
                    windowLeft = l;
                    windowRight = r;
                }

                char leftChar = s.charAt(l);

                countS.put(
                    leftChar,
                    countS.get(leftChar) - 1
                );

                if (
                    countT.containsKey(leftChar) &&
                    countS.get(leftChar) < countT.get(leftChar)
                ) {
                    have--;
                }

                l++;
            }
        }

        return windowSize == Integer.MAX_VALUE
            ? ""
            : s.substring(windowLeft, windowRight + 1);
    }
}