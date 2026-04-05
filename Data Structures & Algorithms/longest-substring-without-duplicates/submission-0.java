class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        Map<Character, Integer> charVsIndex = new HashMap<>();
        int start = 0, end = 0, max = 0;
        charVsIndex.put(s.charAt(start), start);
        max=1;
        while(end < s.length()-1) {
            char curr = s.charAt(++end);
            if(charVsIndex.get(curr) == null) {
                charVsIndex.put(curr, end);
                if(charVsIndex.size() > max) {
                    max = charVsIndex.size();
                }
                curr++;
            } else {
                int dup = charVsIndex.get(curr);
                while(start <= dup) {
                    charVsIndex.remove(s.charAt(start++));
                }
                charVsIndex.put(s.charAt(start), start);
            }
        }
        return max;
    }
}
