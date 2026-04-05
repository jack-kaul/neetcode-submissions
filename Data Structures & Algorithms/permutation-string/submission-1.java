class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) {
            return false;
        }

        Map<Character, Integer> charVsCount = new HashMap<>();
        for(int i=0; i < s1.length(); i++) {
            Character currChar = s1.charAt(i);
            addCharToMap(currChar, charVsCount);
        }

        int start =0, end =0;
        for(int i=0; i< s2.length(); i++) {
            if(charVsCount.get(s2.charAt(i)) != null) {
                start = i;
                for(end=start; end < s2.length(); end++) {
                    if(charVsCount.get(s2.charAt(end)) != null) {
                        removeCharFromMap(s2.charAt(end), charVsCount);
                    } else {
                        while(start <= end) {
                            addCharToMap(s2.charAt(start++), charVsCount);
                        }
                        i = end;
                    }

                    if(charVsCount.size() == 0) {
                        return true;
                    }
                }
            }
        }
        if(charVsCount.size() == 0) {
            return true;
        }
        return false;
    }

    protected void removeCharFromMap(Character currChar, Map<Character, Integer> charFreq) {
        if(charFreq.get(currChar) > 1) {
            charFreq.put(currChar, charFreq.get(currChar));
        } else {
            charFreq.remove(currChar);
        }
    }

    protected void addCharToMap(Character currChar, Map<Character,Integer> charVsCount) {
        if(charVsCount.get(currChar) != null) {
            charVsCount.put(currChar, charVsCount.get(currChar) + 1);
        } else {
            charVsCount.put(currChar, 1);
        }
    }
}
