class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if(n2 < n1) return false;

        String sortedS1 = getSortedStr(s1);
        for(int i = 0; i< n2 - n1; i++) {
            String curr = s2.substring(i, i+n1);
            if(sortedS1.equals(getSortedStr(curr))) {
                return true;
            }
        }
        return false;
    }

    private String getSortedStr(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
