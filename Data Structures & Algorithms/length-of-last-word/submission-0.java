class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        boolean end = false;
        for(int i = s.length()-1; i>0; i--) {
            if(s.charAt(i) == ' ') {
                if(!end) {
                    continue;
                } else {
                    break;
                }
            } else {
                end = true;
                len++;
            }
        }
        return len;
    }
}