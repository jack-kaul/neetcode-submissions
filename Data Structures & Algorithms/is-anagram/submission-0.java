class Solution {
    public boolean isAnagram(String s, String t) {
        for(int i=0;i<s.length();i++) {
            t = t.replaceFirst(s.substring(i, i+1),"");
        }
        if(t.length() == 0) return true;
        return false;
    }
}
