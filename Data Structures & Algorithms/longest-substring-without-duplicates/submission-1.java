class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charVsIndex = new HashMap<>();
        int start = 0, end = 0, max = 0;
        while(end < s.length()) {
            if(charVsIndex.get(s.charAt(end)) == null) {
                charVsIndex.put(s.charAt(end), end);
                if(charVsIndex.size() > max) {
                    max = charVsIndex.size();
                }
            } else {
                int dup = charVsIndex.get(s.charAt(end));
                while(start <= dup) {
                    charVsIndex.remove(s.charAt(start));
                    start++;
                }
            }
            end++;
        }
        return max;
    }
}
