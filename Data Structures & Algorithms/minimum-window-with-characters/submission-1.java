class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();

        if(s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> winCount = new HashMap<>();
        Map<Character, Integer> tCount = new HashMap<>();
        
        for(Character c : t.toCharArray()) {
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);
            System.out.print(c);
        }

        int required = t.length(), formed = 0;

        int l=0, r=0, minWin=n;
        String minString="";

        for(r=0; r < n; r++) {
            Character c = s.charAt(r);
            winCount.put(c, winCount.getOrDefault(c, 0) + 1);

            if(tCount.containsKey(c) && winCount.get(c).intValue() == tCount.get(c).intValue()) {
                formed++;
            }
            
            while(formed == required) {
                if(minWin >= r-l+1){
                    minWin = r-l+1;
                    minString = s.substring(l,r+1);
                }
                char leftChar = s.charAt(l);
                winCount.put(leftChar, winCount.get(leftChar) - 1);

                if(tCount.containsKey(leftChar) && 
                winCount.get(leftChar) < tCount.get(leftChar)) {
                    formed--;
                }

                if(winCount.get(leftChar) == 0) {
                    winCount.remove(leftChar);
                }

                l++;
            }
        }

        return minString;
    }
}
