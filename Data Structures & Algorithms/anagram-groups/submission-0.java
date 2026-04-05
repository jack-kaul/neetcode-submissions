class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Set<Integer> seenIndices = new HashSet<>();
        for(int i = 0; i< strs.length; i++) {
            if(seenIndices.contains(i)) continue;
            List<String> currAnagram = new ArrayList<>();
            String currStr = strs[i];
            currAnagram.add(currStr);
            HashMap<Character, Integer> charVsCount = getCharVsCountMap(currStr);
            for(int j = i + 1; j< strs.length; j++) {
                String toBeSeen = strs[j];
                if(charVsCount.equals(getCharVsCountMap(toBeSeen)) && !seenIndices.contains(j)) {
                    currAnagram.add(toBeSeen);
                    seenIndices.add(j);
                }
            }
            result.add(currAnagram);
        }
        return result;
    }

    private HashMap<Character, Integer> getCharVsCountMap(String currStr) {
        HashMap<Character, Integer> result = new HashMap<>();
        for(int i = 0; i< currStr.length(); i++) {
            Character curr = currStr.charAt(i);
            if(result.get(curr) != null) {
                result.put(curr, result.get(result.get(curr)) + 1);
            } else {
                result.put(curr, 1);            }
        }
        return result;
    }


}
